public class Operaciones {

    public void evaluarCodigo(String estado){
        switch (codigoAceptar(estado)){
             case 200->{
                 System.out.println("Sistema ok");
             }
             case 400->{
                 System.out.println("Sistema ok sin responder con la pagina");
             }
             case 500->{
                 System.out.println("Sistema no responder");
             }
        }
    }

    public int codigoAceptar(String estado){
        if (estado.equals("levantado")){
            return 200;
        } else if (estado.equals("levantado_problemas")){
            return 400;
        } else {
            return 500;
        }
    }
}

/*

 */
