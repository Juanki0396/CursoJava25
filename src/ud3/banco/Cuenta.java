package ud3.banco;

public class Cuenta {
	String cliente;
	double saldo;

	public Cuenta(String cliente) {
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public void hacerTransaccion(double cantidad) throws SaldoInsuficienteException {
		if (cantidad < 0 && Math.abs(cantidad) > this.saldo) {
			throw new SaldoInsuficienteException(this.saldo, cantidad);
		}
		this.saldo += cantidad;
	}

	public String getInfo() {
		return "Cuenta de " + this.cliente + " - Saldo actual: " + this.saldo + " euros";
	}

}
