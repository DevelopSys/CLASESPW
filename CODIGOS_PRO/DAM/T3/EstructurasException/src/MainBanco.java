import controller.Banco;
import model.CuentaCorriente;

public class MainBanco {

    public static void main(String[] args)  {

        Banco bbva = new Banco("BBVA");
        try {
            bbva.ingresarDinero(1000, 1111, "Borja");
        } catch (Exception e) {

        }


        // nombre = bbva cuentaCorriente = null
        /*CuentaCorriente c1 = new CuentaCorriente("Borja",1000,1111);
        CuentaCorriente c2 = new CuentaCorriente("Maria",500);
        CuentaCorriente c4 = new CuentaCorriente("Pepe");
        CuentaCorriente c3 = new CuentaCorriente();*/
        // bbva.darAltaCuenta(new CuentaCorriente("Borja", 1000,1111));
        // cuenta ["Borja",1000,1111]
        // bbva.darAltaCuenta(new CuentaCorriente("Maria"));
        // cuenta ["Maria",0,1245]
        // bbva.darAltaCuenta(new CuentaCorriente("Pepe"));
        // cuenta ["Pepe",0,1245]
    }
}
