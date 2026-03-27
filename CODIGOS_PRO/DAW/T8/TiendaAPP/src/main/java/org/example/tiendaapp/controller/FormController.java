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

import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.example.tiendaapp.HelloApplication;
import org.example.tiendaapp.data.DataSet;
import org.example.tiendaapp.model.User;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    private Button btnCerrar;
    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCompobar;

    @FXML
    private Button btnVaciar;

    @FXML
    private Button btnEliminar;

    @FXML
    private CheckBox checkLista;

    @FXML
    private ChoiceBox<String> comboTipo;
    // Lista de elementos
    private ObservableList<String> perfiles;

    @FXML
    private TextField editApellido;

    @FXML
    private TextField editDni;

    @FXML
    private TextField editMail;

    @FXML
    private TextField editNombre;

    @FXML
    private TextField editPass;

    @FXML
    private RadioButton radioFem;

    @FXML
    private RadioButton radioMasc;

    @FXML
    private Spinner<?> spinnerEdad;
    private SpinnerValueFactory modelEdad;
    // modelo de elementos

    @FXML
    private BorderPane borderGeneral;

    @FXML
    private ListView<User> listViewUsuarios;
    private ObservableList<User> listaUsers;

    private DropShadow shadow;
    private ToggleGroup grupoGenero;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        instances();
        initGUI();
        actions();
    }

    private void initGUI() {
        listViewUsuarios.setItems(DataSet.getListUsers());
        spinnerEdad.setValueFactory(modelEdad);
        grupoGenero.getToggles().addAll(radioMasc, radioFem);
        comboTipo.setItems(perfiles);
        if (checkLista.isSelected()){
            borderGeneral.setRight(listViewUsuarios);
        } else {
            borderGeneral.setRight(null);
        }
    }

    private void instances() {
        modelEdad = new SpinnerValueFactory.IntegerSpinnerValueFactory(18, 90, 25, 1);
        perfiles = FXCollections.observableArrayList();
        listaUsers = FXCollections.observableArrayList();
        perfiles.addAll("Administrador", "Usuario", "Trabajador");
        grupoGenero = new ToggleGroup();
        shadow = new DropShadow();
    }

    private void actions() {
        // directa
        btnAgregar.setOnAction(event -> {
            // se ejecuta tras pulsacion del boton


            if (editNombre.getText().isEmpty()
                    || editPass.getText().isEmpty()
                    || editApellido.getText().isEmpty()
                    || editMail.getText().isEmpty()
                    || grupoGenero.getSelectedToggle() == null
                    || comboTipo.getSelectionModel().getSelectedIndex() == -1

            ) {
                Alert dialogPane = new Alert(Alert.AlertType.WARNING);
                dialogPane.setHeaderText("Faltan datos");
                dialogPane.setContentText("Por favor comprueba todos los datos");
                dialogPane.show();
            } else {
                String nombre = editNombre.getText();
                String apellido = editApellido.getText();
                String correo = editMail.getText();
                String dni = editDni.getText();
                String pass = editPass.getText();
                String perfil = comboTipo.getSelectionModel().getSelectedItem();
                int edad = (int) spinnerEdad.getValue();
                String genero = ((RadioButton) (grupoGenero.getSelectedToggle())).getText();
                User user = new User(nombre, apellido, correo, pass, dni, genero, perfil, edad);
                DataSet.addUser(user);
                //TODO usuario a una lista
                Alert dialogPane = new Alert(Alert.AlertType.INFORMATION);
                dialogPane.setHeaderText("Añadido correcto");
                dialogPane.setContentText("Usuario añadido con exito");
                dialogPane.show();
                clearFields();
            }

        });
        btnVaciar.setOnAction(event -> {
            // se ejecuta tras pulsacion del boton
            clearFields();

        });
        btnCompobar.setOnAction(event -> {
            User user = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (user==null){
                Alert dialogPane = new Alert(Alert.AlertType.ERROR);
                dialogPane.setHeaderText("Error");
                dialogPane.setContentText("No hay nada seleccionado");
                dialogPane.show();
            } else {
                System.out.println("nombre "+user.getNombre());
                System.out.println("apellido "+user.getApellido());
                System.out.println("correo "+user.getCorreo());
            }
        });
        btnEliminar.setOnAction(evet->{
            User user = listViewUsuarios.getSelectionModel().getSelectedItem();
            if (user==null){
                Alert dialogPane = new Alert(Alert.AlertType.ERROR);
                dialogPane.setHeaderText("Error");
                dialogPane.setContentText("No hay nada seleccionado");
                dialogPane.show();
            } else {
                listaUsers.remove(user);
                Alert dialogPane = new Alert(Alert.AlertType.INFORMATION);
                dialogPane.setHeaderText("Eliminado");
                dialogPane.setContentText("Usuario eliminado con existo");
                dialogPane.show();
                listViewUsuarios.getSelectionModel().select(-1);
            }
        });
        btnCerrar.setOnAction(event -> {
            // 1. Creo stage
            Stage stage = new Stage();
            // 2. Creo scene
            try {
                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("login-view.fxml"));
                Scene scene = new Scene(loader.load());
                // 3. Asocio stage a scene
                stage.setScene(scene);
                stage.setTitle("Tienda ThePower");
                stage.show();
                // 4. Cierro stage actual
                ((Stage)btnCerrar.getScene().getWindow()).close();
            } catch (IOException e){
                System.out.println("No se encuentra la ruta");
            }

        });

        // indirecta
        btnCompobar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnEliminar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnCompobar.setOnMouseExited(new ManejoRaton());
        btnEliminar.setOnMouseExited(new ManejoRaton());

        // propiedades
        checkLista.selectedProperty().addListener(
                (observable, oldValue, newValue) -> {
            if (newValue){
                borderGeneral.setRight(listViewUsuarios);
            } else {
                borderGeneral.setRight(null);
            }
        });


    }

    private void clearFields(){
        editNombre.clear();
        editMail.clear();
        editApellido.clear();
        editPass.clear();
        editDni.clear();
        comboTipo.getSelectionModel().select(-1);
        grupoGenero.selectToggle(null);
    }

    class ManejoRaton implements EventHandler<MouseEvent> {

        @Override
        public void handle(MouseEvent event) {
            if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
                ((Button) event.getSource()).setEffect(shadow);
                // comun
                if (event.getSource() == btnCompobar) {
                    System.out.println("Evento raton entrando bComprobar");
                } else if (event.getSource() == btnAgregar) {
                    System.out.println("Evento raton entrando bAgregar");
                } else if (event.getSource() == btnVaciar) {
                    System.out.println("Evento raton entrando bVaciar");
                }
            } else if (event.getEventType() == MouseEvent.MOUSE_EXITED) {
                ((Button) event.getSource()).setEffect(null);
            }


        }
    }
}
