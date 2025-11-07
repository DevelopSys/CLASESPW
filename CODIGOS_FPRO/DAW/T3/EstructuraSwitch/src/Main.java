public class Main {


    public static void main(String[] args) {
        /*System.out.println(DiasSemana.Lunes);
        System.out.println(DiasSemana.Martes);
        System.out.println(DiasSemana.Miercoles);
        System.out.println(DiasSemana.Jueves);
        System.out.println(DiasSemana.Viernes);
        System.out.println(DiasSemana.Sabado);
        System.out.println(DiasSemana.Domingo);*/

        // int char string
        /*
        switch (valor){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
        }*/
        // switch uso con enums, y con valores con , (recordar que se necesita un level minimo de 14)
        DiasSemana dia = DiasSemana.Martes;
        switch (dia) {
            case Lunes, Martes, Miercoles, Jueves -> {
                System.out.println("Dia laborable");
            }
            case Viernes -> {
                System.out.println("Dia laborable, casi lo tenemos");
            }
            case Sabado -> {
                System.out.println("Dia de descanso");
            }
            case Domingo -> {
                System.out.println("Dia de descanso");
            }
        }

        // quiero imprimir la fecha de hoy Hoy es 7 de Noviembre y es Viernes
        System.out.printf("Hoy es %d/%s/%d y es %s de un mes de la estacion de %s%n",7,MesesAnio.Junio.name(),2025,DiasSemana.Viernes.name(), MesesAnio.Junio.estacion);

        // switch con un rango de valores
        // si el numero esta entre 0 y 6 poner un sout
        // si el numero esta entre 7 y 10 poner un sout
        // si el numero esta entre 11 y 16 poner un sout
        // el restante
        /*
        if (n>0 && n<=&)
        else if (n<10)
        else if (n<16)
        else
         */
        // switch con rango -> level 23 y condicion valor como constante
        /*
        final int NUMERO = 0;
        switch (true){
            case (NUMERO>=0 && NUMERO<=6):
                System.out.println("asdasdasd");
            break;

            case (NUMERO>6 && NUMERO<10):
                System.out.println("asdasdasd");
                break;
        }

         */

        Operaciones operaciones = new Operaciones();
        operaciones.evaluarCodigo("caido");
    }
}
