public class Controller {

    private String[] correos = new String[5];
    // [null,null,null,null,null]

    public boolean metodoInsertar(String correo) {
        // funcionalidad - guardar el daro correspondiente en la primera posicion disponible
        // cuando la posicion es null
        boolean estaCorreo = metodoBuscar(correo);
        for (int i = 0; i < correos.length; i++) {
            if (correos[i] == null && !estaCorreo) {
                correos[i] = correo;
                return true;
            }
        }
        return false;
    }

    public String[] getCorreos(){
        
        return correos;
    }

    public int getNumeroCorreos(){
        int numeroCorreos=0;

        for (String item: correos) {
            if (item!=null){
                numeroCorreos++;
            }
        }

        return numeroCorreos;
    }

    public void metodoListar() {
        for (String item : correos) {
            System.out.println(item);
        }
    }

    public void metodoBusqueda() {

    }

    public void metodoEliminar() {

    }


    // el metodo retornará true cuando el correo exista dentro de la lista
    // el metodo retornará false cuando el correo no exista dentro de la lista

    // [a,b,c,d,e,f]
    // i
    private boolean metodoBuscar(String correo) {
        for ( String item : correos ) {
            if(item!= null && item.equalsIgnoreCase(correo)){
                return true;
            }
        }
        return false;
    }
}
