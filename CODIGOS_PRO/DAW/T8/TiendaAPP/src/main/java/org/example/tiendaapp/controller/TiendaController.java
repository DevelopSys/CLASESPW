package org.example.tiendaapp.controller;

import com.google.gson.Gson;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.Product;
import org.example.tiendaapp.model.ProductResponse;

public class TiendaController implements Initializable {

    @FXML
    private Button btnCerrar;

    @FXML
    private Button btnCompra;

    @FXML
    private Button btnDetalle;

    @FXML
    private TableColumn<Product, String> columnaNombre;

    @FXML
    private TableColumn<Product, Number> columnaPrecio;

    @FXML
    private TableColumn<Product, Number> columnaStock;

    @FXML
    private TextField editFiltro;

    @FXML
    private TableView<Product> tablaProductos;
    private ObservableList<Product> listProducts;
    private FilteredList<Product> listFilter;
    // asociar a la lista observable

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        instances();
        initGUI();
        loadJSONProducts();
        actions();
    }

    private void actions() {
        // escuchar la propiedad de text del edit
        editFiltro.promptTextProperty();
        // cuando cambia el texto-> filtro la lista (predicado)
        btnCompra.setOnAction(event -> {
            Product product = tablaProductos.getSelectionModel().getSelectedItem();
            DataSet.addCarrito(product);
            System.out.println(DataSet.getCarrito().size());
            product.setStock(product.getStock()-1);
            tablaProductos.refresh();
            if (product.getStock() == 0){
                listProducts.remove(product);
                // tablaProductos.refresh();
            }
        });
        editFiltro.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                listFilter.setPredicate(product -> product.getTitle().contains(newValue));
            }
        });
        btnDetalle.setOnAction(event -> {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("detail-view.fxml"));
            try {
                Parent root = loader.load();
                // llama al metodo de la nueva controladora
                DetailController detailController = loader.getController();
                detailController.setProducto(tablaProductos.getSelectionModel().getSelectedItem());
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
    }

    private void initGUI() {
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("title"));
        columnaPrecio.setCellValueFactory(new PropertyValueFactory<>("price"));
        columnaStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
        tablaProductos.setItems(listFilter);
    }

    private void instances() {
        listProducts = FXCollections.observableArrayList();
        listFilter = new FilteredList<>(listProducts);
    }

    private void loadJSONProducts() {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://dummyjson.com/products"))
                .GET() // peticion por defecto
                .build();
        try {
            HttpResponse<String> reponse = client.send(request,HttpResponse.BodyHandlers.ofString());
            String body = reponse.body();
            Gson gson = new Gson();
            ProductResponse responseProduct = gson.fromJson(body, ProductResponse.class);
            listProducts.setAll(responseProduct.getProducts());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
