package ud3.restaurante;

public class Main {
    public static void main(String[] args) {
        Restauracion restaurante = new ComedorSocial("Estofado", 10);
        restaurante.enseñarMenu();
        int raciones = restaurante.prepararComida(15);
        System.out.println("Se están preparando " + raciones + " raciones");
        double cambio = restaurante.cobrar(200);
        System.out.println("Me devuelven " + cambio + " $");

    }
}
