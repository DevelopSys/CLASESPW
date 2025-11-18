public class Main {

    public static void main(String[] args) {
        double calificacion = 10;

        switch(calificacion){
            case double n when (n>= 0 && n <=3.9) -> {System.out.println("F");}
            case double n when (n>= 4 && n <=4.9) -> {System.out.println("D");}
            case double n when (n>= 5 && n <=6.9) -> {System.out.println("C");}
            case double n when (n>= 7 && n <=8.9) -> {System.out.println("B");}
            case double n when (n>= 9 && n <=10)  -> {System.out.println("A");}
            default -> throw new IllegalStateException("Unexpected value: " + calificacion);
        }

        /*
        switch (true){
            case boolean _ when (temperaturaC < 0) -> {
                descripcion = "Bajo 0";
                recomendacion = "Usa abrigo grueso, guantes y bufanda";
            }
            case boolean _ when (temperaturaC <= 15) -> {
                descripcion = "Frio";
                recomendacion = "Usa abrigo, guantes y bufanda";
            }
            case boolean _ when (temperaturaC <= 25) -> {
                descripcion = "Templado";
                recomendacion = "Usa ropa ligera y cómoda";
            }
            case boolean _ when (temperaturaC <= 35) -> {
                descripcion = "Calor";
                recomendacion = "Usa ropa fresa y mantente hidratado";
            }
            default -> {
                descripcion = "Mucho Calor";
                recomendacion = "Evita el sol directo y bebe mucha agua";
            }
        }*/
    }
}
