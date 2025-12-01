package ud3.cifrados;

public class Sustitucion implements Cifrador {
    final String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
    final String abcCifrado = "qwertyuiopasdfghjklñzxcvbnm.";

    public Sustitucion(){}

    public String cifrar(String msg, int key){
        return fromABCtoABC(msg, abecedario, abcCifrado);
    }

    public String descifrar(String msg, int key){
        return fromABCtoABC(msg, abcCifrado, abecedario);
    }

    private String fromABCtoABC(String msg, String from, String to){
        String cifMsg = "";
        for(int i = 0; i < msg.length(); i++){
            Character c = msg.charAt(i);
            boolean isMayus = Character.isUpperCase(c);
            c = isMayus ? Character.toLowerCase(c) : c;
            int posAbc = from.indexOf(c);
            Character cCif = to.charAt(posAbc);
            if(isMayus){
                cCif = Character.toUpperCase(cCif);
            }
            cifMsg = cifMsg + cCif;
        }
        return cifMsg;
    }

}
