package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editPass;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegistrar;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        actions();
    }

    private void actions() {
        btnLogin.setOnAction(evet ->
        {
            // comprobar que los dos campos estan rellenos
            String mail = editCorreo.getText();
            String pass = editPass.getText();
            // hacer el filtrado de la lista o de la BD (SELECT)
            if (mail.equals("admin@admin.com") && pass.equals("admin")){
                // carga la otra ventana y cierra esta
                // 1. crea una ventana
                Stage ventanaPrincipal = new Stage();
                // 2. Crea una Scene
                // 2.1 Carga la parte grafica
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                    Scene scene = new Scene(fxmlLoader.load());
                    ventanaPrincipal.setScene(scene);
                    ventanaPrincipal.setTitle("Formulario de administracion");
                    ventanaPrincipal.show();
                    ((Stage)(btnLogin.getScene().getWindow())).close();
                } catch (IOException e) {
                    System.out.println("Error en la carga de la ruta");
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Fallo");
                alert.setContentText("Fallo en login");
                alert.show();
            }
        });
    }
}
