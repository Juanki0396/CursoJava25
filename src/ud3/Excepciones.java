package ud3;

public class Excepciones {
    final String[] palabrasPrhibidas = new String[] {
        "uno",
        "dos"
    };
    
    class PalabraProhibidaException extends Exception {
        public PalabraProhibidaException(String palabra) {
            super("La frase contiene una palabra prohibida: \"" + palabra + "\"");
        }
    }

    public static void comprobrarPalabra(String palabra) throws PalabraProhibidaException{

    }
    public static void main(String[] args) {
        
    }
}
