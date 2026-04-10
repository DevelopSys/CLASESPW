import controller.Banco;
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
    void setUp(){
         banco = new Banco();
         banco.agregarCuenta(new CuentaBancaria(1,500));
         banco.agregarCuenta(new CuentaBancaria(2,1));
     }

     // las pruebas de cada uno de los metodos
    // unitarias
    // unitarios de excepciones
    // unitarias de parametros


}
