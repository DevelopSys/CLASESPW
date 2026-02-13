import java.io.*;

public class OperancionesFicheros {

    // obtener datos de un fichero
    public void leerDatosFichero() {
        File file = new File("src/main/java/resources");
        System.out.println("Existe " + file.exists());
        System.out.println("Tamaño " + file.length());
        System.out.println("Es fichero " + file.isFile());
        System.out.println("Es carpeta " + file.isDirectory());
        System.out.println("Ruta abs " + file.getAbsolutePath());
    }

    public void leerHijos(String path) {
        File file = new File(path);
        for (File s : file.listFiles()) {
            System.out.println(s);
            leerHijos(s.getAbsolutePath());

        }
    }

    public void crearFicheros(String path) {
        File file = new File(path + "/ejemplo.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Fallo en la escritura");
            System.out.println(e.getMessage());
        }

    }

    public void crearDirectorio(String path) {
        File file = new File(path + "/ejemplo/cosa/otra/mia");

        if (!file.exists()) {
            file.mkdir();
            // porque no hay excepcion a capturar
            // file.mkdirs();
        }
    }

    public void lecturaASCII(String path) {
        File file = new File(path);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            // FileReader -> caracter a caracter
            int codigo = -1;

            while ((codigo = reader.read()) != -1) {
                // int -> char
                System.out.print(codigo);
                System.out.print(" - ");
                System.out.print((char) codigo);
                System.out.println();
            }


        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra la ruta a leer");
            // intenta leer otra ruta
        } catch (IOException e) {
            System.out.println("Error al leer, no hay permisos");
        } finally {
            try {
                reader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }

        }

    }

    public void lecturaLinea(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine())!=null){
                System.out.println(linea);
            }



        } catch (FileNotFoundException e) {
            System.out.println("Error en la lectura de la ruta");
        } catch (IOException e) {
            System.out.println("Error en el modo del fichero, estas en modo lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerradp del fichero");
            }

        }


    }

    public void lectorCodigos(String path){
        File file = new File(path);
        BufferedReader bufferedReader =null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = bufferedReader.readLine();
            String[] codigos = linea.split(" ");
            for (String codigo: codigos) {
                // System.out.println(codigo);
                int numero = Integer.parseInt(codigo);
                System.out.print((char) numero);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException e) {
            System.out.println("Fallo en la lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error de cifrado");
            }
        }
    }

}
