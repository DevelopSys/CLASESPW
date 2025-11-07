public class Main {

    public static void main(String[] args) {
        // Autobox
        Integer numeroComplejo = 100;
        // Unbox
        int numeroPrimitivo = numeroComplejo;

        // OPERADORES
            // aritmeticos; + - * / %
            // asigancion; = =+ =- =* =/ =%
            // relacionales; < <= == > >= !=
            // logicos; || && !

        int numero1 = 5;
        int numero2 = 6;
        int resultado = 5&6;
        System.out.println("El resultado de la comparacion & es "+resultado);

        numero1=12;
        numero2=13;
        resultado = numero1 | numero2;
        System.out.println("El resultado de la comparacion | es "+resultado);

        numero1 = 23;
        numero2 = 25;
        String palabra = null;
        boolean resultadoBool = numero1>numero1 || numero2>100 || numero1==23 || palabra.length()!=0;
        //
        System.out.println("El resultado de la comparacion | es "+resultadoBool);

        // resultadoBool = numero1>=numero1 && numero2<100 && numero1==23 && palabra.length()!=0;

        System.out.println("El resultado de la comparacion & es "+resultadoBool);

        // System.out.println(palabra.length()); // NullPointerException
        // CASTEO -> cambiar tipo temporalmente (tipo)varible
        char letra = 67;
        System.out.println("La letra es "+(char)67);
        int letraNumero = 'A';
        System.out.println("El caracter asociado a la letra A es "+letraNumero);
        String frase = "Esta frase la vamos a codificar";
        for (int i = 0; i < frase.length(); i++) {
            char letraPalabra = frase.charAt(i);
            int codigo = letraPalabra;
            if(i%2==0){
                codigo*=2;
            } else {
                codigo*=4;
            }
            System.out.print(codigo+" ");
        }




    }
}
