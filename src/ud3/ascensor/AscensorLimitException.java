package ud3.ascensor;

public class AscensorLimitException extends Exception {
	public AscensorLimitException() {
		super("Has llegado al límite del edificio. KABUM");
	}
}
