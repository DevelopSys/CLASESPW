package org.example.tiendaapp.controller;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.Usuario;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private ListView<Usuario> listViewUsuarios;
    private ObservableList<Usuario> listaUsuarios;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnComprobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private Button btnEliminar;

    @FXML
    private Button btnVolver;
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
        btnVolver.setOnAction(event -> {
            Stage stage = new Stage();
            try {
                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
                Scene scene = new Scene(loader.load());
                stage.setScene(scene);
                stage.setTitle("Tienda APP");
                stage.show();
                ((Stage)btnVolver.getScene().getWindow()).close();
            }catch (IOException e){
                System.out.println("Poner el dialogo");
            }
        });
        btnComprobar.setOnAction(event -> {
            Usuario usuario = listViewUsuarios.getSelectionModel().getSelectedItem();
            // hay alguien seleccionado
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Detalles");
            alert.setContentText(String.format("Los datos del usuarios son\nNombre: %s\nApellido: %s\nCorreo: %s"
                    ,usuario.getNombre(),usuario.getApellido(),usuario.getCorreo()));
            alert.show();
        });
        btnVaciar.setOnAction(event -> {
            vaciarCampos();
        });
        btnAgregar.setOnAction(event -> {
            // comprobar que todos los campos estan rellenos

            Alert dialogo = null;
            if (editNombre.getText().isEmpty()
                    || editPass.getText().isEmpty()
                    || editDireccion.getText().isEmpty()
                    || editApellido.getText().isEmpty()
                    || editCorreo.getText().isEmpty()
                    || grupoGenero.getSelectedToggle() == null
                    || comboPerfil.getSelectionModel().getSelectedIndex() == -1
            ) {
                dialogo = new Alert(Alert.AlertType.WARNING);
                dialogo.setTitle("Datos");
                dialogo.setContentText("Confirma que todos los datos esten rellenos");
                dialogo.show();
            } else {
                String nombre = editNombre.getText(); // ""
                String apellido = editApellido.getText(); // ""
                String correo = editCorreo.getText(); // ""
                String direccion = editDireccion.getText(); // ""
                String pass = editPass.getText(); // ""
                String perfil = comboPerfil.getSelectionModel().getSelectedItem(); // ""
                String genero = ((RadioButton) (grupoGenero.getSelectedToggle())).getText(); // null.getText() -> NullPointerExc
                int edad = spinnerEdad.getValue();
                Usuario usuario = new Usuario(nombre, apellido, direccion, correo, pass, edad, perfil, genero);
                DataSet.addUser(usuario);
                // listaUsuarios.add(usuario);
                dialogo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogo.setTitle("Exito!");
                dialogo.setContentText("Usuario agregado con exito. Quieres vaciar los campos existentes");
                dialogo.getButtonTypes().add(ButtonType.CLOSE);
                Optional<ButtonType> result = dialogo.showAndWait();
                if (result.get() == ButtonType.OK) {
                    vaciarCampos();
                }
            }


        });
        btnEliminar.setOnAction(event -> {
            // eliminar el elemento de la lista
            Usuario usuario = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (usuario == null) {
                Alert dialogo = new Alert(Alert.AlertType.WARNING);
                dialogo.setTitle("Seleccion");
                dialogo.setContentText("Por favor selecciona un elemento para poder eliminar");
                dialogo.show();
            } else {
                Alert dialogo = new Alert(Alert.AlertType.CONFIRMATION);
                dialogo.setTitle("Eliminar");
                dialogo.setContentText("Estas seguro que quieres eliminar el usuario con correo " + usuario.getCorreo());
                Optional<ButtonType> respuesta = dialogo.showAndWait();
                if (respuesta.get() == ButtonType.OK) {
                    listaUsuarios.remove(usuario);
                    listViewUsuarios.getSelectionModel().select(-1);
                }
            }
        });

        btnComprobar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnEliminar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnComprobar.setOnMouseExited(new ManejoRaton());
        btnEliminar.setOnMouseExited(new ManejoRaton());

        checkLista.selectedProperty().addListener(
                (observable, oldValue, newValue) -> {
                    if (newValue) {
                        borderGeneral.setRight(listViewUsuarios);
                    } else {
                        borderGeneral.setRight(null);
                    }
                });

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
        listViewUsuarios.setItems(listaUsuarios);
        if (!checkLista.isSelected()) { // !true -> false
            borderGeneral.setRight(null);
        }
    }

    private void instances() {
        shadow = new DropShadow();
        grupoGenero = new ToggleGroup();
        listaPerfiles = FXCollections.observableArrayList("Administrador", "Cliente", "Trabajador");
        // arraylist -> añado un usuario , refrescar la lista
        // observablelist -> añado un usuario (se efectua una señal a todo elemento con relacion)
        listaUsuarios = DataSet.getListaUsuarios();
        modeloSpinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 18, 1);
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event) {
            // System.out.println("Raton por encima");
            if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
                // System.out.println("Saliendo");
                ((Button) (event.getSource())).setEffect(null);
            } else if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                // System.out.println("Entrando");
                ((Button) (event.getSource())).setEffect(shadow);
            }
        }
    }
}
