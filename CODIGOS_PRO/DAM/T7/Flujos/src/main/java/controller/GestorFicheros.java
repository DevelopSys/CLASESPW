package controller;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class GestorFicheros {

    public void crearFichero(String path) {
        // src/main/java/recursos/escritura.txt
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Error en la creacion");
            System.out.println(e.getMessage());
        }
    }

    public void crearCarpeta(String path) {
        // "src/main/java/recursos/cosa/ejemplo"
        File file = new File(path);
        file.mkdirs();
    }

    public void informacioFichero(String path) {
        // "src/main/java/recursos/cosa/ejemplo"
        File file = new File(path);
        // Arrays.stream(file.listFiles()).toList().forEach();
    }

    public void lectorFichero(String path) {
        // src/main/java/recursos/lectura.txt
        File file = new File(path);
        FileReader reader = null; // para poder cerrarlo
        try {
            reader = new FileReader(file);
            // leer de forma normal -> ascii 0-255
            int codigo;
            while ((codigo = reader.read()) != -1) {
                System.out.print((char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error el fichero no existe");
            // indicame la ruta del fichero nuevamente
            // lectorFichero("nueva ruta");
        } catch (IOException e) {
            System.out.println("Error en la lectura del fichero");
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void lectorLineas(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            // src/main/java/recursos/lectura.txt
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("el fichero no existe");
            // lectorFichero("asdasd");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
            // ponte en contacto con el admin de la empresa
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void escribirCaracteres(String path) {
        // "src/main/java/recursos/escritura.txt"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que mensaje quieres guardar");
        String mensaje = scanner.nextLine();
        File file = new File(path);
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, true);
            writer.write("palabra");
            writer.write(123);
            writer.write("\n");
            /*for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                writer.write(String.valueOf((int)letra));
                writer.write(" ");
            }*/
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void escribirLineas(String path) {
        // src/main/java/recursos/escritura.txt
        File file = new File(path);
        BufferedWriter bufferedWriter;
        PrintWriter printWriter = null;

        try {
            printWriter = new PrintWriter(new FileWriter(file, true));
            printWriter.println("esta linea es un ejemplo de la nueva forma de escribir");
            printWriter.println("Ahora se como hacer la escritura de forma conjunta");
            printWriter.println();
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }

        }

    }

    public void codificarMensaje(String path) {
        // "src/main/java/recursos/escritura.txt"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime que mensaje quieres guardar");
        String mensaje = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Dime la fase de cifrado");
        int fase = scanner.nextInt();
        File file = new File(path);
        FileWriter writer = null;

        try {
            writer = new FileWriter(file, false);
            // este es el mensaje a codificar
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                // E -> 69 -> "69"
                writer.write(String.valueOf(((int) letra) * fase));
                writer.write(" ");
            }
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void descifrarMenasje(String path) {
        System.out.println(path);
        File file = new File(path);
        BufferedReader bufferedReader = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cual es la fase de codificacion");
        try {
            int fase = scanner.nextInt();

            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            String[] codigos = linea.split(" ");
            for (String code : codigos) {
                // "707" -> 707
                int numero = Integer.parseInt(code) / fase;
                System.out.print((char) numero);
            }
        }catch (InputMismatchException e){
            System.out.println("La fase es incorrecta, por favor empieza el proceso nuevamente");
            descifrarMenasje(path);
        }
        catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("No hay permisos de lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
                System.out.println(e.getMessage());
            }
        }

    }

}
