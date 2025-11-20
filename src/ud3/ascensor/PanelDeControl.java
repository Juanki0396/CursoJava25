package ud3.ascensor;

import ud3.ascensor.Ascensor;

public class PanelDeControl {
	Ascensor asc;

	public PanelDeControl(Ascensor asc) {
		this.asc = asc;
	}

	public void llamarAscensor(int plantaActual) {
		int diff = plantaActual - this.asc.planta;
		if (diff > 0) {
			this.asc.subir(diff);
		} else if (diff < 0) {
			this.asc.bajar(Math.abs(diff));
		}
		this.asc.imprimirInfo();
	}

}
