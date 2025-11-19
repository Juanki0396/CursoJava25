package ud3.animales;

public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido(){
        System.out.println("Sonido genérico");
    }
    
}
