package ud3.ascensor;


public class PanelDeControl {
	private Ascensor asc;

	public PanelDeControl(Ascensor asc) {
		this.asc = asc;
	}

	/**
	 * Mueve el ascensor a la planta seleccionada. No comprueba los límites del ascensor.
	 * @param destino Planta a la que mueve el ascensor.
	 * @throws AscensorLimitException Se lanza si la planta acaba fuera de los límites del ascensor
	 */
	private void moverAscensor(int destino) throws AscensorLimitException {
		int diff = destino - this.asc.planta;
		if (diff > 0) {
				this.asc.subir(diff);
			} else if (diff < 0) {
				this.asc.bajar(Math.abs(diff));
			}
	}

	/**
	 * Llama al ascensor para que acuda a la planta seleccionada. Se supone que si se llama al ascensor
	 * debe hacerse desde una planta válida.
	 * @param plantaActual Planta a la que debe acudir el ascensor.
	 */
	public void llamarAscensor(int plantaActual) {
		try{
			moverAscensor(plantaActual);
		}
		catch (AscensorLimitException e){
			System.err.println("El ascensor se ha averiado yendo a su planta");
		}
		this.asc.imprimirInfo();
	}

	/**
	 * Lleva al usuario dentro del ascensor a la planta de destino. Si la planta no es válida, imprime un 
	 * mensaje de error y no se mueve.
	 * @param destino Planta a la que debe moverse el ascensor
	 */
	public void irAPlanta(int destino){
		if (destino > this.asc.maxPlanta || destino < this.asc.minPlanta){
			System.out.println("ERROR: La planta seleccionada no existe");
			return;
		}
		try{
			moverAscensor(destino);
		}
		catch (AscensorLimitException e){
			System.err.println("ERROR: Innaccesible");
		}
		this.asc.imprimirInfo();


	}

}
