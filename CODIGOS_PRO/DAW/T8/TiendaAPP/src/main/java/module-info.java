module org.example.tiendaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.tiendaapp to javafx.fxml;
    exports org.example.tiendaapp;
}