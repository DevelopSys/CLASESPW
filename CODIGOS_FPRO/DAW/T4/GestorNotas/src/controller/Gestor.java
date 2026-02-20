package controller;

import model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Producto> productos;

    public Gestor() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        // existe el codigo
        // recorro - pregunto - rompo - decido

        // productos.stream().filter() // Stream -> los que han cumplido
        // bool -> si / no coincide
        boolean existe =
                productos.stream()
                        .anyMatch(item -> item.getCodigo().equalsIgnoreCase(p.getCodigo()));
        if (existe) {
            System.out.println("Codigo ya usado, no se puede agregar");
        } else {
            productos.add(p);
            System.out.println("Producto agregado correctamente");
        }

        /*
        if (buscarPorCodigo(p.getCodigo()).isPresent()){
            System.out.println("No puedo agregar, codigo duplicado");
        } else {
            productos.add(p);
        }*/
    }

    public void asignarPrecios() {
        productos.stream()
                .filter(item -> item.getPrecio() < 0)
                .forEach(item -> item.setPrecio((Math.random() * 100) + 1));
    }

    public void mostrarProductos() {
        // productos.forEach(item->item.mostrarDatos());
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio() {
        // recorro - capturo precio - sumo a sumatorio - divido / size - retono
        // p1       p2      p3      p4      p5
        // -        -       -       -       -
        // precio   precio  precio  precio  precio -> media
        return productos
                .stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).count();
    }

    public List<Producto> getLsitaProductosCaros(double limite) {
        return productos.stream().filter(item -> item.getPrecio() >= limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo) {
        return productos.stream()
                .filter(item -> item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst();
    }

    public void ordendarProductos() {
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion
            , double valor) {
        return productos.stream().filter(item -> condicion.test(item, valor)).toList();
    }

    public DoubleSummaryStatistics getEstadisticas() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .summaryStatistics();
    }

    public void obtenerProductosAPI() {
        HttpClient client = null;
        try {
            String urlProductos = "https://dummyjson.com/products"; // @Body
            // "abro el navegador"
            client = HttpClient.newHttpClient();
            // "crea la peticion"
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlProductos)).build();
            // "lanza la peticion y espera una respuesta"
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            JSONObject jsonObject = new JSONObject(body);
            JSONObject producto1 = jsonObject.getJSONArray("products").getJSONObject(28);
            System.out.println(producto1.getString("title"));
        } catch (IOException e) {
            System.out.println("Error en de I/O");
        } catch (InterruptedException e) {
            System.out.println("Error en la conexion");
        } finally {
            try {
                client.close();
            } catch (Exception e){
                System.out.println("Error en el cerrado");
            }

        }


    }

}
