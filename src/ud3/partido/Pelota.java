package ud3.partido;

public class Pelota {
    boolean hinchada;
    double prob;
    
    public Pelota(double prob){
        this.hinchada = true;
        this.prob = prob;
    }

    public boolean chutar(){
        double n = Math.random();
        if(n < this.prob){
            this.hinchada = false;
        }
        return this.hinchada;
    }
    
}
