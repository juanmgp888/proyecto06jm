package es.santander.ascender.proyecto06;

public class CalculadoraMemoria {
    public double resultado;
    public double memoria01 = 0.00d;
    private double valorEntrada;

    // Constructor
    public CalculadoraMemoria(double valorEntrada){
        this.valorEntrada = valorEntrada;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }
    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public double sumar(){
        resultado = this.memoria01 + this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double restar(){
        resultado = this.memoria01 - this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double multiplicar(){
        resultado = this.memoria01 * this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double dividir(){
        resultado = this.memoria01 / this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }

    public static void main(String[] args) {
        // Llamada al constructor
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.00d);
       
        System.out.println(calculadora.getValorEntrada());  // Imprime: 0.0

        calculadora.setValorEntrada(45d);
        System.out.println(calculadora.getValorEntrada());  // Imprime: 45

        calculadora.sumar();
        System.out.println(calculadora.resultado);  // Imprime: 45

        calculadora.setValorEntrada(5.1d);
        calculadora.restar();
        System.out.println(calculadora.resultado);  // 39,9
        
        calculadora.setValorEntrada(2.76d); 
        calculadora.restar();
        System.out.println(calculadora.resultado);  // 37,14

        calculadora.setValorEntrada(4.7d);
        calculadora.multiplicar();
        System.out.println(calculadora.resultado);  // 174,558

        calculadora.setValorEntrada(7d);
        calculadora.dividir();
        System.out.println(calculadora.resultado);  // 29,9368
    }
}
