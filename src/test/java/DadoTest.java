import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {


    @Test
    void lanzar() {
        Dado dado = new Dado();

        int numInicio = 1;
        int numFinal = 6;

        int numero = dado.lanzar();

        assertTrue(numero >= numInicio && numero <= numFinal);

    }

    @Test
    void sumar(){
        Calculadora calc = new Calculadora(4,5);

        assertEquals(9, calc.sumar());

    }



}