package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import es.santander.ascender.proyecto06jm.CalculadoraMemoria;


public class CalculadoraMemoriaTest {
    
    @Test
    public void testSumar(){

        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.setValorEntrada(45.0);
        double resultadoSuma = calculadora.sumar(45);

        assertEquals(45d, resultadoSuma, 0.00001);
    }
    @Test
    public void testRestar(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 45d;
      //  calculadora.setValorEntrada(5.1d); 
        double resultadoResta = calculadora.restar(5.1d);

        assertEquals(39.9d, resultadoResta, 0.00001);
    }
    @Test
    public void testMultiplicar(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 37.14;
       // calculadora.setValorEntrada(4.7d); 
        double resultadoMultiplicacion = calculadora.multiplicar(4.7d);

        assertEquals(174.558d, resultadoMultiplicacion, 0.00001);
    }
    @Test
    public void testDividir(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 174.558d;
       // calculadora.setValorEntrada(7d); 
        double resultadoDivision = calculadora.dividir(7d);
        
        assertEquals(24.936857143, resultadoDivision, 0.00001);
    }
    @Test
    public void testResetear() {

        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        // Estado de la la memoria
        calculadora.memoria01 = 24.936857143d;

        calculadora.resetear();

        // Verificar que después de resetear, memoria01 y resultado sean 0
        assertEquals(0.0d, calculadora.memoria01, 0.00001);
        assertEquals(0.0d, calculadora.resultado, 0.00001);
    }
}
