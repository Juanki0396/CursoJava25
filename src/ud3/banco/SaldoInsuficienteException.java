package ud3.banco;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(double saldo, double cantidad){
        super("Imposible retirar " + cantidad + " euros. Saldo restante actual: " + saldo + " euros");
    }
}
