package org.example.tiendaapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // carga la parte grafica en el FXMLoader
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
        // crea la escena y le asocia la parte grafica
        Scene scene = new Scene(fxmlLoader.load());
        // pone la escena en la ventana
        stage.setScene(scene);
        // pone el titulo en la ventana
        stage.setTitle("Tienda The Power!");
        // muestra la ventana
        stage.show();
    }
}
