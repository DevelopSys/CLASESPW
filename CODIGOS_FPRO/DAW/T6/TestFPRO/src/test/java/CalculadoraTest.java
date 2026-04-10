import model.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    // @Test indica que este metodo es de prueba
    @Test
    void testSumar() {
        assertEquals(10, calculadora.sumar(4, 6));
    }

    @Test
    void testRestar() {
        assertEquals(10, calculadora.resta(14, 4));
    }

    @Test
    void testMultiplicar() {
        assertEquals(20, calculadora.multi(10, 2));

    }

    @Test
    void testDividir() {
        // assertEquals(5,calculadora.division(10,2));
        // tienes que da 5, en la division con resultado 5
        assertEquals(5, calculadora.division(10, 2));
        assertThrows(IllegalArgumentException.class, () -> calculadora.division(10, 0));
    }

    @ParameterizedTest
    @CsvSource({
            "10,100,10",
            "4,16,4",
            "1,1,1",
            "6,1,1",
    })
    void testDividirMult(int resultado, int op1, int op2) {
        // assertEquals(5,calculadora.division(10,2));
        // double res = calculadora.division(op1, op2);
        assertEquals(resultado, calculadora.division(op1, op2));
        // assertThrows(IllegalArgumentException.class, () -> calculadora.division(op1, op2));
    }

}
