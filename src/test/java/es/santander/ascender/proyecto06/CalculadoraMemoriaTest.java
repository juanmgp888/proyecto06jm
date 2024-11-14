package es.santander.ascender.proyecto06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class CalculadoraMemoriaTest {
    
    @Test
    public void testSumar(){

        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.setValorEntrada(45.0);
        double resultadoSuma = calculadora.sumar();

        assertEquals(45d, resultadoSuma, 0.00001);
    }
    @Test
    public void testRestar(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 45d;
        calculadora.setValorEntrada(5.1d); 
        double resultadoResta = calculadora.restar();

        assertEquals(39.9d, resultadoResta, 0.00001);
    }
    @Test
    public void testMultiplicar(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 37.14;
        calculadora.setValorEntrada(4.7d); 
        double resultadoMultiplicacion = calculadora.multiplicar();

        assertEquals(174.558d, resultadoMultiplicacion, 0.00001);
    }
    @Test
    public void testDividir(){  
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.0);

        calculadora.memoria01 = 174.558d;
        calculadora.setValorEntrada(7d); 
        double resultadoDivision = calculadora.dividir();
        
        assertEquals(24.9368571, resultadoDivision, 0.00001);
    }
}
