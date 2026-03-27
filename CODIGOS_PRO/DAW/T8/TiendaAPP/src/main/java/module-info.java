module org.example.tiendaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;
    requires com.google.gson;
    requires java.net.http;
    requires static lombok;


    opens org.example.tiendaapp to javafx.fxml;
    exports org.example.tiendaapp;

    exports org.example.tiendaapp.model;
    opens org.example.tiendaapp.model to javafx.fxml, org.json, com.google.gson, java.net.http;

    exports org.example.tiendaapp.controller;
    opens org.example.tiendaapp.controller to javafx.fxml, org.json, com.google.gson, java.net.http;
}