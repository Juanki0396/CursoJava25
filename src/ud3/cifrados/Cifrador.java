package ud3.cifrados;

public interface Cifrador {
    public String cifrar(String msg, int key);
    public String descifrar(String msg, int key);
}
