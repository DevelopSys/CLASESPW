public class Main {

    public static void main(String[] args) {

        // indico cuantos string se van a poder guardar
        String[] clase = new String[]{"Borja", "Pedro", null, null};
        // ["Borja","Maria","Lucas","Pedro"]
        String[] nombre = new String[7];
        // [null,null,null,null,null]
        /*
        int[] edadesNumero = new int[]{18, 19, 22, 90, 76};
        int[] edades = new int[5];
        // [0,0,0,0,0]
        boolean[] aciertosOK = new boolean[]{false,true,true,true};
        boolean[] aciertos = new boolean[5];
        // [false,false,false,false,false]
        */
        System.out.println("La longitud del array es " + clase.length);
        nombre[0] = "Maria";
        // [Maria,Marcos,null,null,null]
        nombre[1] = "Marcos";
        // [Maria,Marcos,null,null,Borja]
        // guardar en la ultima posicion
        nombre[nombre.length-1] = "Borja";
        // System.out.println("El nombre seleccionado es "+clase[2]);
        /*
        recorre desde el principio hasta el final, indicados por el programador -> recorrer y modificar
        for (int i = clase.length-1; i >= 0; i--) {
            System.out.println(clase[i]);
        }
        for (int i = 0; i < nombre.length/2; i++) {
            nombre[i] = "Nombre "+i;
        }

        // recorre desde el principio hasta el final -> recorrer
        for( String element : clase ){
            System.out.println(element);
        }
         */
        for (int i = 0; i < clase.length; i++) {
            if (clase[i] == null){
                clase[i] = "Dato";
                break;
            }
        }

        for (String element: clase) {
            System.out.println(element);
        }
    }

}
