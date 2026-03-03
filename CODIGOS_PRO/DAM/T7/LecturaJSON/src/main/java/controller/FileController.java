package controller;

import model.Equipo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class FileController {

    File file;

    PrintWriter printWriter;

    public void exportarEquipo(Equipo equipo) {
        File file = new File("src/main/java/ficheros/clasificion.txt");

        try {
            printWriter = new
                    PrintWriter(new FileWriter(file, true));
            printWriter.println(equipo);
        } catch (IOException e) {
            System.out.println("Ruta no valida");
        } finally {
            try {
                printWriter.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }
    }
}
