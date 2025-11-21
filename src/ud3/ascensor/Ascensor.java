package ud3.ascensor;


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

	/**
	 * Sube el ascensor el número de plantas especificadas
	 * @param	nPlantas Número de plantas a subir. Debe ser un número positivo
	 * @return  La planta actual después de subir
	 */
	public int subir(int nPlantas) throws AscensorLimitException {
		this.planta += nPlantas;
		if (this.planta > this.maxPlanta) {
			throw new AscensorLimitException();
		}
		return this.planta;
	}

	/**
	 * Baja el ascensor el número de plantas especificadas
	 * @param	nPlantas Número de plantas a bajar. Debe ser un número positivo
	 * @return  La planta actual después de bajar
	 */
	public int bajar(int nPlantas) throws AscensorLimitException {
		this.planta -= nPlantas;
		if (this.planta < this.minPlanta) {
			throw new AscensorLimitException();
		}
		return this.planta;
	}

	/**
	 * Imprime información sobre la planta en la cual se encuentra el ascensor.
	 */
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
