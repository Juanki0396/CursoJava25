package ud3.animales;

public class Gallina extends Animal{
    boolean tieneHuevo;

    public Gallina(String nombre, int edad, boolean tieneHuevo){
        super(nombre, edad);
        this.tieneHuevo = tieneHuevo;
    }

    public void hacerSonido(){
        System.out.println("Cococo");
    }

    public void ponerHuevo(){
        if(this.tieneHuevo){
            System.out.println("La gallina ha puesto un huevo");
            this.tieneHuevo = false;
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal("Ñu", 3);
        Gallina g = new Gallina("Turuleta", 2, true);
        a.hacerSonido();
        g.hacerSonido();
        g.ponerHuevo();
    }
    
}
