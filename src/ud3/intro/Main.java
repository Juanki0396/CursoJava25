package ud3.intro;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(10);
        Square s2 = new Square(s);
        Square s3 = new Square();
        System.out.println("El lado del cuadrado 1 es: " + s.lado);
        System.out.println("El lado del cuadrado 2 es: " + s2.lado);
        int n1 = 10;
        int n2 = n1;
        n1 = 20;
        System.out.println("El entero 1 es: " + n1);
        System.out.println("El entero 2 es: " + n2);
    }
    
}
