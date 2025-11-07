import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {

        // Evaluar el dia de la semana y si es laborable o no es laborable
        // string, int, char
        DiasSemana diaSemana = DiasSemana.Martes;


        // solo funciona si tengo un level de 14 o >
        switch (diaSemana) {
            case Lunes, Martes, Miercoles, Jueves -> System.out.println("Laborable");
            case Viernes -> System.out.println("Laborable, casi lo tenemos");
            case Sabado, Domingo -> System.out.println("Descanso");
        }

        MesesAnio mesActual = MesesAnio.Febrero;
        // System.out.println("La fecha de hoy es 7 de "+MesesAnio.Noviembre+" de 2025 y es "+DiasSemana.Viernes);
        System.out.printf("La fecha de hoy es %d de %s de %d y es %s estamos en la estacion de %s, los dias que tiene este mes son %d%n"
                ,7,mesActual,2025,DiasSemana.Viernes, mesActual.estacion,mesActual.diasMes);


        // 0 numero 10
        // 10 numero 20
        // 20 numero 30
        // if numero>=0 && numero<10
        // else if numero>=10 && numero<20
        // else if numero>=20 && numero<30
        // level 23
        // la variable a evaluar en los casos sea FINAL
        /*final int NUMERO = 12;
        switch (true){
            case (NUMERO>=0 && NUMERO<10) ->{
                System.out.println("23123");
            }
            case (NUMERO>10 && NUMERO<20) ->{
                System.out.println("23123");
            }
        }*/

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarServidor("ok_fail");
    }
}
