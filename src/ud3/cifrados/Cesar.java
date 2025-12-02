package ud3.cifrados;

public class Cesar implements Cifrador{
    public String cifrar(String msg, int key){
        return usingCaesarAlgorithm(msg, key);
    }
    public String descifrar(String msg, int key){
        return usingCaesarAlgorithm(msg, -key);
    }

    private String usingCaesarAlgorithm(String msg, int key){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < msg.length(); i++){
            char c = msg.charAt(i);
            byte b = (byte) c;
            b += key;
            char newC = (char) b;
            sb.append(newC);
        }
        return sb.toString();        
    }
}
