import controller.Banco;
import exception.CuentaException;
import exception.SaldoInsuficienteException;
import model.Calculadora;
import model.CuentaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class BancoTest {

    private Banco banco;

    // variables

    // indica que este metodo se ejecuta de primeras
    // @BeforeEach
    // indica que este metodo es un metodo para poder probar casos
    // @Test
    // indica que este metoro es una metodo para poder probar multiples datos, indicados con el CSV
    // @ParameterizedTest
    // @CsvSource

    @BeforeEach
    void setUp(){
        banco = new Banco();
        banco.agregarCuenta(new CuentaBancaria(1,100));
        banco.agregarCuenta(new CuentaBancaria(2,100));
    }

    @Test
    public void sacarDineroTest(){
        assertEquals(-1,banco.sacarDinero(1,700));

    }

    @Test
    public void sacarDineroExceptionTest(){
        assertThrows(SaldoInsuficienteException.class, ()-> {
            banco.sacarDinero(1, 700);
        });
        assertThrows(CuentaException.class, ()-> {
            banco.sacarDinero(7, 700);
        });
    }




}
