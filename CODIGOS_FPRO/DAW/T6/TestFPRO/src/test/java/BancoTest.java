import controller.Banco;
import exceptions.CuentaNotFoundException;
import exceptions.SaldoException;
import model.Calculadora;
import model.CuentaBancaria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {

    private Banco banco;

    @BeforeEach
    void setUp() {
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i);
        }
        banco = new Banco();
        banco.agregarCuenta(new CuentaBancaria(1, 500));
        banco.agregarCuenta(new CuentaBancaria(2, 100));
    }

    @Test
    void pruebaScarDinero() {
        assertEquals(true, banco.sacarDinero(1, 400));
        assertEquals(false, banco.sacarDinero(1, 700));
    }

    @Test
    void pruebaScarDineroException() {
        assertThrows(SaldoException.class, () -> banco.sacarDinero(1, 700));
        assertThrows(CuentaNotFoundException.class, () -> banco.sacarDinero(6, 700));
        assertThrows(IndexOutOfBoundsException.class, () -> banco.sacarDinero(6, 700));

    }

    // las pruebas de cada uno de los metodos
    // unitarias
    // unitarios de excepciones
    // unitarias de parametros


}
