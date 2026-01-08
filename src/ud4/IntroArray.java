package ud4;

public class IntroArray {
    public static void main(String[] args) {
        System.out.println("Argumentos totales: " + args.length);
        System.out.println("ARGS:");
        for(String elem : args){
            System.out.println(elem);
        }
        String[] prueba1 = new String[2];
        System.arraycopy(args, 1, prueba1, 0, 2);
        String[] prueba2 = java.util.Arrays.copyOfRange(args, 1, 3);
        System.out.println("PRUEBA1:");
        for(int i = 0; i < prueba1.length; i++){
            System.out.println(prueba1[i]);
        }
        System.out.println("PRUEBA2");
        for(int i = 0; i < prueba2.length; i++){
            System.out.println(prueba2[i]);
        }
    }
}
