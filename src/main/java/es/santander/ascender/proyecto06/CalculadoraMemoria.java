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

    public double sumar(double vEntrada){
        this.valorEntrada = vEntrada;
        resultado = this.memoria01 + this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double restar(double vEntrada){
        this.valorEntrada = vEntrada;
        resultado = this.memoria01 - this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double multiplicar(double vEntrada){
        this.valorEntrada = vEntrada;
        resultado = this.memoria01 * this.valorEntrada;
        this.memoria01 = resultado;
        return resultado;
    }
    public double dividir(double vEntrada){
        this.valorEntrada = vEntrada;
        if (vEntrada == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        } else {
            resultado = this.memoria01 / this.valorEntrada;
            this.memoria01 = resultado;
            return resultado;
        }
    }

    public static void main(String[] args) {
        // Llamada al constructor
        CalculadoraMemoria calculadora = new CalculadoraMemoria(0.00d);
       
        System.out.println(calculadora.getValorEntrada());  // Imprime: 0.0

        calculadora.setValorEntrada(45d);
        System.out.println(calculadora.getValorEntrada());  // Imprime: 45

        calculadora.sumar(45d);
        System.out.println(calculadora.resultado);  // Imprime: 45

        calculadora.restar(5.1d);
        System.out.println(calculadora.resultado);  // 39,9
  
        calculadora.restar(2.76d);
        System.out.println(calculadora.resultado);  // 37,14

        calculadora.multiplicar(4.7d);
        System.out.println(calculadora.resultado);  // 174,558

        calculadora.dividir(7d);
        System.out.println(calculadora.resultado);  // 24,936857143
    }
}
