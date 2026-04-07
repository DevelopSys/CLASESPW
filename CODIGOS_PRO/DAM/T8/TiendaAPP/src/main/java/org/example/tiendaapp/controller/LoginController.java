package org.example.tiendaapp.controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.Usuario;

public class LoginController implements Initializable {


    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegistro;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editPass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        actions();
    }

    private void actions() {

        btnRegistro.setOnAction(event -> {
            // 1. Crear una ventana
            Stage stage = new Stage();
            // 2. Creo una escena
            try {

                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                Scene scene = new Scene(loader.load());

                // 3. Asocio ventana con escena
                stage.setScene(scene);
                stage.setTitle("Registro usuarios");
                stage.show();

                // 4. Cerrar la pantalla de login
                ((Stage)btnRegistro.getScene().getWindow()).close();

            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("La pantalla que se intenta cargar no esta disponible");
                alert.show();
            }

        });
        btnLogin.setOnAction(event -> {
            // consulto sobre una lista (o sobre base de datos)
            Usuario usuarioLogin = DataSet.getLogin(editCorreo.getText(), editPass.getText());
            if(usuarioLogin!=null){
                // que perfil tiene?
                // 1. Crear una ventana
                Stage stage = new Stage();
                /*
                switch (usuarioLogin.getPerfil().toLowerCase()){
                    case "administrador":
                        // FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("admin-view.fxml"));
                        break;
                    case "cliente":
                        // FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("cliente-view.fxml"));
                        break;
                }*/

                // 2. Creo una escena
                try {

                    FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("client-view.fxml"));
                    Scene scene = new Scene(loader.load());

                    // 3. Asocio ventana con escena
                    stage.setScene(scene);
                    stage.setTitle("Tienda productos");
                    stage.show();

                    // 4. Cerrar la pantalla de login
                    ((Stage)btnRegistro.getScene().getWindow()).close();

                } catch (IOException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("La pantalla que se intenta cargar no esta disponible");
                    alert.show();
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Datos incorrectos");
                alert.show();
            }


        });
    }
}
