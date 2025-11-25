package ud3.restaurante;

public class ComedorSocial implements Restauracion {
    private String nombrePlato;
    private int nPlatos;
    private int nComandas;

    public ComedorSocial(String nombrePlato, int nPlatos){
        this.nombrePlato = nombrePlato;
        this.nPlatos = nPlatos;
        this.nComandas = 0;
    }

    public void darBienvenida(){
        System.out.println("Sois bienvenidos");
    }

    public void enseñarMenu(){
        System.out.println("Tenemos " + this.nPlatos + " raciones de " + this.nombrePlato);
    }

    public int prepararComida(int nPers){
           if (nPers > this.nPlatos){
            this.nComandas = this.nPlatos;
            this.nPlatos = 0;
        }
        else {
            this.nComandas = nPers;
            this.nPlatos -= nPers;
        }
        return this.nComandas;
    }

    public double cobrar(double dinero){
        this.nComandas = 0;
        return dinero;
    }
}

