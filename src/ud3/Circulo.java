//Escriba un programa Java para crear una clase llamada "Círculo" con un atributo de radio. 
// Puede acceder y modificar este atributo. Calcula el área y la circunferencia del círculo. 
package ud3;

public class Circulo {
    int radio;

    public Circulo(int radio){
        this.radio = radio;
    }

    public double calcularPerimetro(){
        double p = 2 * Math.PI * this.radio;
        return p;
    }
    
    public double calcularArea(){
        double a = Math.PI * this.radio * this.radio;
        return a;
    }

    public static void imprimirInfo(Circulo c){
        System.out.println("Radio: " + c.radio);
        System.out.println("Perímetro: " + c.calcularPerimetro());
        System.out.println("Area: " + c.calcularArea());
    }

    public static void main(String[] args) {
        Circulo s = new Circulo(50);
        imprimirInfo(s);
        Circulo d = new Circulo(5);
        imprimirInfo(d);
    }
    
}
