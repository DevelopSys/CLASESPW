package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    // document.querySelector("")
    // document.getElementById()
    @FXML
    private Button btnSaludar, btnLimpiar;

    @FXML
    private TextField editNombre;

    @FXML
    private Text textSaludo;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        actions();
    }

    private void actions() {
        btnSaludar.setOnAction(event -> {

            if (editNombre.getText().isEmpty()){
                textSaludo.setText("No hay nadie a quien saludar");
            } else {
                textSaludo.setText(String.format("Enhirabuena %s has completado el reto",editNombre.getText()));
            }

        });

        btnLimpiar.setOnAction(event -> {
            editNombre.clear();
            textSaludo.setText("");
        });
    }
}
