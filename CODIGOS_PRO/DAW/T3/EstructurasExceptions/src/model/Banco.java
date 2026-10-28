package model;

public class Banco {

    private String nombre;
    private CuentaCorriente cuenta;

    public Banco() {
    } // nombre -> null cuenta -> null

    public void darAltaCuenta(CuentaCorriente cuenta) {
        // cambias la cuenta existente?
        this.cuenta = cuenta;
    }

    public void cancelarCuenta(String titular, int pin) throws Exception  {
        // para hacer esto cuenta = null
        // que tiene que pasar? ->
        /*if (cuenta != null && cuenta.getTitular().equals(titular) && cuenta.getPin() == pin ){
            System.out.println("Cuenta cancelada");
            cuenta = null;
        }
        try {
            if (cuenta.getTitular().equals(titular) && cuenta.getPin() == pin) {
                System.out.println("Cuenta cancelada");
                cuenta = null;
            }
        }catch (NullPointerException e){
            System.out.println("La cuenta no esta asociada a nadie, no se puede cancelar");
            System.out.println(e.getMessage());
        }*/
        if (cuenta.getTitular().equals(titular) && cuenta.getPin() == pin ){
            System.out.println("Cuenta cancelada");
            cuenta = null;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaCorriente getCuenta() {
        // validas algo de la cuenta???
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        // validas si ya hay cuenta???
        this.cuenta = cuenta;
    }
}
