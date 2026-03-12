package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    // tener una varible por cada uno de los elementos del fxml
    // document.querySelector("#id")
    // document.getElementById("id")

    @FXML
    private Button botonSaludar;

    @FXML
    private TextField editNombre;

    @FXML
    private Text textoSaludo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // todos los codigos que  yo ponga aqui, se ejecuta nada mas cargar la parte fxml
        botonSaludar.setOnAction(event -> {
            String texto = editNombre.getText();
            if (texto.isEmpty()){
                textoSaludo.setText("No hay nadie a quien saludar");
            } else {
                textoSaludo.setText("Enhorabuena "+texto+" has completado la app JAVA FX");
            }
        });
    }
}
