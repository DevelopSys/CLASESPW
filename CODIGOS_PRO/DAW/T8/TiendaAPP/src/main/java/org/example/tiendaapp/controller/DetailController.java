package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.example.tiendaapp.model.Product;

import java.io.Serializable;
import java.net.URL;
import java.util.ResourceBundle;

public class DetailController implements Initializable {

    @FXML
    private Label textoPrecio, textoDesc, textoNombre;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setProducto(Product product){
        this.textoDesc.setText(product.getDescription());
        this.textoNombre.setText(product.getTitle());
        String precio = String.valueOf(product.getPrice());
        this.textoPrecio.setText(precio);
    }
}
