import controller.Centralita;
import model.Llamada;
import model.LlamadaLocal;
import model.LlamadaNacional;
import model.LlamadaProvincial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Llamada llamada = new Llamada(11111,22222,10);
        llamada.mostrarDatos();
        LlamadaLocal llamadaLocal = new LlamadaLocal(1111,2222,10);

        LlamadaProvincial llamadaProvincial = new LlamadaProvincial(3333,4444,10);
        LlamadaNacional llamadaNacional = new LlamadaNacional(2222,3333,10,3);
        llamadaNacional.mostrarDatos();*/
        // LlamadaNacional llamadaNacional = new LlamadaNacional(2222,3333,10,2);
        // llamadaNacional.mostrarDatos();
        // llamadaLocal.mostrarDatos();
        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        Centralita centralita = new Centralita();
        do{
            System.out.println("1. Registrar llamada");
            System.out.println("2. Mostrar llamdas");
            System.out.println("3. Mostrar caja");
            System.out.println("4. Salir");
            System.out.println("Que quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Indica que llamada quieres registrar");
                    System.out.println("1-Local");
                    System.out.println("2-Provincial");
                    System.out.println("3-Nacional");
                    int tipo = scanner.nextInt();
                    Llamada llamada= null;
                    System.out.println("Indica nOrigen");
                    long nOrigen = scanner.nextLong();
                    System.out.println("Indica nDestino");
                    long nDestino = scanner.nextLong();
                    System.out.println("Indica duracion");
                    int duracion = scanner.nextInt();
                    switch (tipo){
                        case 1->{
                            llamada = new LlamadaLocal(nOrigen,nDestino,duracion);
                        }
                        case 2->{
                            llamada = new LlamadaProvincial(nOrigen,nDestino,duracion);
                        }
                        case 3->{
                            System.out.println("Indica franja");
                            int franja = scanner.nextInt();
                            llamada = new LlamadaNacional(nOrigen,nDestino,duracion,franja);
                        }
                    }
                    centralita.registrarLlamada(llamada);

                }
                case 2->{
                    centralita.mostraDatosLlamadas();
                }
                case 3->{
                    centralita.mostrarCaja();
                }
                case 4->{
                    System.out.println("Saliendo");
                }
                default -> {
                    System.out.println("Opcion invalida");
                }
            }


        }while (opcion!=4);
    }
}
