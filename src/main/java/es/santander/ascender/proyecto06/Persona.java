package es.santander.ascender.proyecto06;

public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;
    private float estatura;

    // Constructor
    public Persona(String nombre, int edad, float estatura) {
        // "nombre" atributo = "nombre" parámetro
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;  // Es necesario indicar this, aunque no haya parámetro estatura.
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre; // El atributo. No es preciso especificar this. (No se confunde con ningún parámetro)
    }

    // Setter para el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para la edad
    public int getEdad() {
        return edad;
    }

    // Setter para la edad
    public void setEdad(int edad) {
        if (edad >= 0) {  // Validación simple
            this.edad = edad;
        } else {
            System.out.println("Edad no válida.");
        }
    }

    // Getter para estatura
    public float getEstatura(){
        return estatura;
    }

    // Setter para estatura
    public void setEstatura(float estatura){
        if (estatura >=0) {
            this.estatura = estatura;
        } else {
            System.out.println("Estatura no válida");
        }
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona. Llama al constructor
        Persona persona = new Persona("Juan", 30, 1.90f);

        // Usar getters para obtener los valores. Mostramos el que hay en memoria iniciado
        // por la llamada al constructor
        System.out.println(persona.getNombre());  // Imprime: Juan
        System.out.println(persona.getEdad());    // Imprime: 30
        System.out.println(persona.getEstatura());    // Imprime: 1.90

        // Usar setters para modificar los valores
        persona.setNombre("Carlos");
        persona.setEdad(35);
        persona.setEstatura(1.76f);

        // Mostrar los detalles actualizados
        persona.mostrarDetalles();
    }
}
