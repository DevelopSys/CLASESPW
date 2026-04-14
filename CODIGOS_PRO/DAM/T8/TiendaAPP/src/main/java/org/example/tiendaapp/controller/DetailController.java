package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import org.example.tiendaapp.model.Producto;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailController implements Initializable {


    @FXML
    private Text textPrecio;
    @FXML
    private BorderPane borderGeneral;
    @FXML
    private Text textTitulo;
    @FXML
    private Text textDescripcion;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setProducto(Producto producto){
        textDescripcion.setText(producto.getDescription());
        textTitulo.setText(producto.getTitle());
        textPrecio.setText(String.valueOf(producto.getPrice()));
    }
}
