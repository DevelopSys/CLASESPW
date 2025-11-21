public class Controller {

    //[null,null,null,null,null]
    String[] correos = new String[5];

    public boolean metodoAnadir(String correo) {
        for (int i = 0; i < correos.length; i++) {
            if (correos[i] == null) {
                correos[i] = correo;
                return true;
            }
        }
        return false;
    }

    public void metodoListar() {
        System.out.println("Añadir listar elemento");
        for (String item : correos) {
            System.out.println(item);
        }
    }

    public boolean metodoBuscar(String correo) {
        // null,null,null,null,null
        // f
        for (String item : correos) {
            if (item!=null && item.equalsIgnoreCase(correo)) {
                System.out.println("Encontrado");
                return true;
            }
        }
        return false;
    }
}
