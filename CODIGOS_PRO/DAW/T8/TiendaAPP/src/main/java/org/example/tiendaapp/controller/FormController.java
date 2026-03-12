package org.example.tiendaapp.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import org.example.tiendaapp.model.User;

import java.net.URL;
import java.util.ResourceBundle;

public class FormController implements Initializable  {

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnCompobar;

    @FXML
    private Button btnVaciar;

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
    private DropShadow shadow;
    private ToggleGroup grupoGenero;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        instances();
        initGUI();
        actions();
    }

    private void initGUI() {
        spinnerEdad.setValueFactory(modelEdad);
        grupoGenero.getToggles().addAll(radioMasc,radioFem);
        comboTipo.setItems(perfiles);
    }

    private void instances() {
        modelEdad = new SpinnerValueFactory.IntegerSpinnerValueFactory(18,90,25,1);
        perfiles = FXCollections.observableArrayList();
        perfiles.addAll("Administrador","Usuario","Trabajador");
        grupoGenero = new ToggleGroup();
        shadow = new DropShadow();
    }

    private void actions() {
        btnAgregar.setOnAction(event -> {
            // se ejecuta tras pulsacion del boton
            String nombre= editNombre.getText();
            String apellido= editApellido.getText();
            String correo= editMail.getText();
            String dni= editDni.getText();
            String pass= editPass.getText();
            String perfil= comboTipo.getSelectionModel().getSelectedItem();
            int edad = (int) spinnerEdad.getValue();
            String genero = ((RadioButton)(grupoGenero.getSelectedToggle())).getText();

            User user = new User(nombre,apellido,correo, pass, dni, genero,perfil,edad);
        });
        btnVaciar.setOnAction(event -> {
            // se ejecuta tras pulsacion del boton
            System.out.println("Pulsado el boton vaciar");
            event.getSource(); // ->btnVaciar

        });
        btnCompobar.setOnAction(event -> {
            // se ejecuta tras pulsacion del boton
            System.out.println("Pulsado el boton comprobar");
            event.getSource(); // ->btnCompobar

        });
        btnCompobar.setOnMouseEntered(new ManejoRaton());
        btnVaciar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseEntered(new ManejoRaton());
        btnAgregar.setOnMouseExited(new ManejoRaton());
        btnVaciar.setOnMouseExited(new ManejoRaton());
        btnCompobar.setOnMouseExited(new ManejoRaton());

    }

    class ManejoRaton implements EventHandler<MouseEvent>{

        @Override
        public void handle(MouseEvent event) {
            if(event.getEventType() == MouseEvent.MOUSE_ENTERED){
                ((Button)event.getSource()).setEffect(shadow);
                // comun
                if(event.getSource() == btnCompobar){
                    System.out.println("Evento raton entrando bComprobar");
                } else if (event.getSource() == btnAgregar){
                    System.out.println("Evento raton entrando bAgregar");
                } else if (event.getSource() == btnVaciar){
                    System.out.println("Evento raton entrando bVaciar");
                }
            } else if(event.getEventType() == MouseEvent.MOUSE_EXITED){
                ((Button)event.getSource()).setEffect(null);
            }


        }
    }
}
