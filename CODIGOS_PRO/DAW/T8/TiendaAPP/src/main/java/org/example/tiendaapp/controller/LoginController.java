package org.example.tiendaapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.User;

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
            User user = DataSet.getLogin(mail, pass);
            //System.out.println(user.getNombre());
            if (user != null) {
                // carga la otra ventana y cierra esta
                // 1. crea una ventana
                Stage ventanaPrincipal = new Stage();
                // 2. Crea una Scene
                // 2.1 Carga la parte grafica
                try {
                    FXMLLoader fxmlLoader = null;
                    switch (user.getPerfil().toLowerCase()) {
                        case "admin":
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                            ventanaPrincipal.setTitle("Formulario de administracion");
                            break;
                        case "usuario":
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("tienda-view.fxml"));
                            ventanaPrincipal.setTitle("Tienda de productos");
                            break;
                        default:
                            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("form-view.fxml"));
                    }
                    Parent parent = fxmlLoader.load();
                    // fxmlLoader.getController();
                    // a esta le pasas el dato
                    Scene scene = new Scene(parent);
                    ventanaPrincipal.setScene(scene);
                    ventanaPrincipal.show();
                    ((Stage) (btnLogin.getScene().getWindow())).close();
                } catch (IOException e) {
                    System.out.println("Error en la carga de la ruta");
                    System.out.println(e.getMessage());
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
