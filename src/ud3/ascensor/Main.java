package ud3.ascensor;

public class Main {
    public static void main(String[] args) {
        PanelDeControl panelDeControl = new PanelDeControl(new Ascensor(-5, 40));
        panelDeControl.llamarAscensor(0);
        panelDeControl.irAPlanta(24);
        panelDeControl.llamarAscensor(-4);
        panelDeControl.irAPlanta(40);
        panelDeControl.llamarAscensor(3);
        panelDeControl.irAPlanta(50);
        panelDeControl.irAPlanta(30);
    }
}
