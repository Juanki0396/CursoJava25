package ud3.ascensor;

import ud3.ascensor.AscensorLimitException;

public class Ascensor {
	final int minPlanta;
	final int maxPlanta;
	int planta;

	public Ascensor(int minPlanta, int maxPlanta, int planta) {
		this.minPlanta = minPlanta;
		this.maxPlanta = maxPlanta;
		this.planta = planta;
	}

	public Ascensor(int minPlanta, int maxPlanta) {
		this.minPlanta = minPlanta;
		this.maxPlanta = maxPlanta;
		this.planta = 0;
	}

	public int subir(int nPlantas) throws AscensorLimitException {
		this.planta += nPlantas;
		if (this.planta > this.maxPlanta) {
			throw new AscensorLimitException();
		}
		return this.planta;
	}

	public int bajar(int nPlantas) throws AscensorLimitException {
		this.planta -= nPlantas;
		if (this.planta < this.minPlanta) {
			throw new AscensorLimitException();
		}
		return this.planta;
	}

	public void imprimirInfo() {
		System.out.println("El ascensor se encuentra en la planta " + this.planta);
	}

	public static void main(String[] args) throws AscensorLimitException {
		Ascensor asc = new Ascensor(-1, 20);
		asc.subir(13);
		asc.imprimirInfo();
		asc.bajar(14);
		asc.imprimirInfo();
		asc.bajar(2);
	}
}
