package ud3.cifrados;

public class Main {
    public static void main(String[] args) {
        Cifrador cif = new Sustitucion();
        if(runTest("Buenos dias", 23, cif)){
            System.out.println("El cifrador funciona como se esperaba");
        }
        else {
             System.out.println("El cifrador NO funciona como se esperaba");
        }
        
    }

    public static boolean runTest(String msg, int key, Cifrador cif){
        System.out.println("Mensaje original: " + msg);
        String cifMsg = cif.cifrar(msg, key);
        System.out.println("Mensaje cifrado: " + cifMsg);
        String defcifMsg = cif.descifrar(cifMsg, key);
        System.out.println("Mensaje descifrado: " + defcifMsg);
        return msg.equals(defcifMsg);
    }
    
}
