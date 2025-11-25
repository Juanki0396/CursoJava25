package ud3.restaurante;

public class BurgerKing implements Restauracion{
    private int nHamburguesas;
    private final double precioHamburguesa;
    private String nombrePlato;
    private int nComandas;

    public BurgerKing(int nHamburguesas, double precioHamburguesa, String nombrePlato){
        this.nHamburguesas = nHamburguesas;
        this.precioHamburguesa = precioHamburguesa;
        this.nombrePlato = nombrePlato;
        this.nComandas = 0;
    }

    public void enseñarMenu(){
        System.out.println("El plato del día es: " + this.nombrePlato + " " + this.precioHamburguesa + "$");
    }

    public int prepararComida(int nPers){
        if (nPers > this.nHamburguesas){
            this.nComandas = this.nHamburguesas;
            this.nHamburguesas = 0;
        }
        else {
            this.nComandas = nPers;
            this.nHamburguesas -= nPers;
        }
        return this.nComandas;
    }

    public double cobrar(double dinero){
        double total = this.nComandas * this.precioHamburguesa;
        if (dinero < total){
            System.out.println("No seas rácano.");
            return 0;
        }
        this.nComandas = 0;
        return dinero - total;
    }
    
}
