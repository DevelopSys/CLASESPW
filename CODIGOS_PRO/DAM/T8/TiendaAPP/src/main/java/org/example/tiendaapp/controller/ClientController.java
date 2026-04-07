package org.example.tiendaapp.controller;

import com.google.gson.Gson;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.Producto;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.ResourceBundle;

public class ClientController implements Initializable {


    @FXML
    private Button btnComprar, btnCarrito, btnCarritoVentana;
    @FXML
    private TableColumn<Producto, Number> colId;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Number> colPrecio;

    @FXML
    private TableColumn<Producto, Number> colStock;

    @FXML
    private TableView<Producto> tablaProductos;

    private ObservableList<Producto> listaProductos;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // https://dummyjson.com/products/
        // Request, Response, Client, Librerias
        instancias();
        initGUI();
        acciones();

    }

    private void acciones() {
        btnCarrito.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Carrito");
            alert.setContentText("Vas a comprar un total de "+DataSet.getCarrito().size()
                    +" productos, con un total en euros de "+DataSet.getCosteCarrito()+"\nQueeres terminar la compra?");
            alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.NO);
            Optional<ButtonType> respuesta = alert.showAndWait();
            if(respuesta.get() == ButtonType.OK){
                Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
                alert1.setTitle("Compra exitpsa");
                alert1.setContentText("Comprarealizada con existo");
                DataSet.clearCarrito();
            }
        });
        btnComprar.setOnAction(event -> {
            // que producto esta seleccionado de la tabla
            Producto producto = tablaProductos.getSelectionModel().getSelectedItem();
            if (producto!=null){
                DataSet.addProduct(producto);
                producto.setStock(producto.getStock()-1);
                // tablaProductos.refresh();
                if (producto.getStock() == 0){
                    listaProductos.remove(producto);
                }
                tablaProductos.getSelectionModel().select(null);
                // tablaProductos.getSelectionModel().select(null);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("No hay nada seleccionado");
                alert.show();
            }
        });
        btnCarritoVentana.setOnAction(event -> {
            // FXMLoader cargar un fxml nuevo
            // Los datos del ListView son los que estan en el carrito del DataSet
        });

        /*
         Al darle al boton infoProduto
            1. Cargo un FXMLoader nuevo
            2. La informacion a mostrar se le tiene que comunicar a la nueva escena (la linea seleccionada)
            // La comunicacion entre dos escenas se realiza mediante CONTROLADORAS
         */
    }

    private void initGUI() {
        tablaProductos.setItems(listaProductos);
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("title"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("price"));
        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        cargaProductosJSON();
    }

    private void instancias() {
        listaProductos = FXCollections.observableArrayList();
    }

    private void cargaProductosJSON() {
        HttpClient client = null;
        try {

            client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .GET()
                    .uri(URI.create("https://dummyjson.com/products"))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            Gson gson = new Gson();
            JSONObject productsJSON = new JSONObject(body);
            JSONArray productsJSONArray = productsJSON.getJSONArray("products");
            for (int i = 0; i < productsJSONArray.length(); i++) {
                JSONObject productJSONObj = productsJSONArray.getJSONObject(i);
                Producto producto = gson.fromJson(productJSONObj.toString(), Producto.class);
                // System.out.println(producto.getTitle());
                listaProductos.add(producto);
            }

            // System.out.println(body);
        } catch (Exception e) {
            System.out.println("Error en la peticion HTTP");
            System.out.println(e.getMessage());
        } finally {
            try {

                client.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }
    }
}
