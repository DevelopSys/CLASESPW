package controller;

import com.google.gson.Gson;
import model.Equipo;
import model.Jugador;
import model.Liga;
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIController {

    private FileController fileController;

    public APIController(){
        fileController = new FileController();
    }

    public void getAllLigas() {
        String url = "https://www.thesportsdb.com/api/v1/json/123/all_leagues.php";
        // 1-> abro el cliente "navegador"

        HttpClient client = null;
        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            // 2-> crea la peticion
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            // 3-> espera la respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String stringLigas = response.body();
            JSONObject jsonLiga = new JSONObject(stringLigas);
            JSONArray arrayLigas = jsonLiga.getJSONArray("leagues");
            for (int i = 0; i < arrayLigas.length(); i++) {
                JSONObject ligaJSON = arrayLigas.getJSONObject(i);
                Liga liga = gson.fromJson(ligaJSON.toString(), Liga.class);
                // String idLiga = ligaJSON.getString("idLeague");
                // String nombreLiga = ligaJSON.getString("strLeague");
                System.out.printf("%s - %s%n", liga.getIdLeague(), liga.getStrLeague());
            }
            System.out.println(jsonLiga);
        } catch (Exception e) {
            System.out.println("Error en la peticion HTTP");
        } finally {
            try {
                client.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void getAllClasificacion(int id) {
        String url = "https://www.thesportsdb.com/api/v1/json/123/lookuptable.php?l="+id;
        HttpClient client;

        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject clasificacionJSON = new JSONObject(body);
            JSONArray clasificacionArray = clasificacionJSON.getJSONArray("table");
            for (int i = 0; i < clasificacionArray.length(); i++) {
                JSONObject equipoJSON = clasificacionArray.getJSONObject(i);
                Equipo equipo = gson.fromJson(equipoJSON.toString(), Equipo.class);
                System.out.println(equipo);
                fileController.exportarEquipo(equipo);
            }
        } catch (Exception e) {
            System.out.println("Error en el proccesamiento de la peticion");
            System.out.printf(e.getMessage());
        }

    }

    public void getAllPlayers(int id){
        String url = "https://www.thesportsdb.com/api/v1/json/123/lookup_all_players.php?id="+id;
        HttpClient client;

        try {
            Gson gson = new Gson();
            client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create(url))
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject equipoDetail = new JSONObject(body);
            JSONArray jugadoresArray = equipoDetail.getJSONArray("player");
            for (int i = 0; i <jugadoresArray.length(); i++) {
                JSONObject jugadorJSON = jugadoresArray.getJSONObject(i);
                Jugador jugador = gson.fromJson(jugadorJSON.toString(), Jugador.class);
                System.out.printf("%s - %s%n",jugador.getStrPlayer(), jugador.getStrPosition());
            }

        } catch (Exception e) {
            System.out.println("Error en el proccesamiento de la peticion");
            System.out.printf(e.getMessage());

        }
    }
}
