package ud3;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirInformación(){
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }

    public void cumplirAños(){
        this.edad += 1;
    }

    public static void main(String[] args){
        Persona pers1 = new Persona("Maria", 30);
        Persona pers2 = new Persona("Paco", 40);

        pers1.imprimirInformación();
        System.out.println(pers1.nombre + " ha cumplido un año más");

        pers1.cumplirAños();

        pers1.imprimirInformación();
        pers2.imprimirInformación();
    }
    
}
