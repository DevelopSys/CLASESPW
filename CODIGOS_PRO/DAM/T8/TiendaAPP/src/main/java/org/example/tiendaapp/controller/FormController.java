package org.example.tiendaapp.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import org.example.tiendaapp.model.Usuario;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private CheckBox checkLista;

    @FXML
    private ComboBox<String> comboPerfil;
    private ObservableList<String> listaPerfiles;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editCorreo;

    @FXML
    private TextField editDireccion;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    private ToggleGroup grupoGenero;

    @FXML
    private Spinner<Integer> spinnerEdad;
    private DropShadow shadow;
    // no se le asocia una lista
    private SpinnerValueFactory.IntegerSpinnerValueFactory modeloSpinner;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        instances();
        initGUI();
        actions();
    }

    private void actions() {
        btnComprobar.setOnAction(event -> {

        });
        btnVaciar.setOnAction(event -> {
            vaciarCampos();
        });
        btnAgregar.setOnAction(event -> {
            // comprobar que todos los campos estan rellenos
            String nombre = editNombre.getText();
            String apellido = editApellido.getText();
            String correo = editCorreo.getText();
            String direccion = editDireccion.getText();
            String pass = editPass.getText();
            String perfil = comboPerfil.getSelectionModel().getSelectedItem();
            String genero = ((RadioButton) (grupoGenero.getSelectedToggle())).getText();
            int edad = spinnerEdad.getValue();
            Usuario usuario = new Usuario(nombre, apellido, direccion, correo, pass, edad, perfil, genero);
            System.out.println("Usuario creado con exito: " + usuario.getNombre());
            vaciarCampos();
        });
        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());

    }

    private void vaciarCampos() {
        editNombre.clear();
        editApellido.clear();
        editCorreo.clear();
        editPass.clear();
        editDireccion.clear();
        spinnerEdad.increment(-90);
        comboPerfil.getSelectionModel().select(0);
        grupoGenero.selectToggle(null);
    }

    private void initGUI() {
        grupoGenero.getToggles().addAll(radioFemenino, radioMasculino);
        comboPerfil.setItems(listaPerfiles);
        spinnerEdad.setValueFactory(modeloSpinner);
    }

    private void instances() {
        shadow = new DropShadow();
        grupoGenero = new ToggleGroup();
        listaPerfiles = FXCollections.observableArrayList("Administrador", "Cliente", "Trabajador");
        modeloSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 18, 1);
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event) {
            // System.out.println("Raton por encima");
            if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
                System.out.println("Saliendo");
                ((Button) (event.getSource())).setEffect(null);
            } else if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                System.out.println("Entrando");
                ((Button) (event.getSource())).setEffect(shadow);
            }
        }
    }
}
