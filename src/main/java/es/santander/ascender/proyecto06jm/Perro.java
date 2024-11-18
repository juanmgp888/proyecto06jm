package es.santander.ascender.proyecto06jm;

public class Perro {

    private double peso;
 
    public Perro(double peso) {
        // Que pasa en peso 0 o negativo
        if (peso > 0){
            this.peso = peso;
        } else {
            // System.out.println("El peso indicado no es válido.");
            throw new IllegalArgumentException("El peso no es válido. Debe se mayor que cero.");
        }
    }

    public void comer(double pesoComida) {
        this.peso += pesoComida;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }    
}
