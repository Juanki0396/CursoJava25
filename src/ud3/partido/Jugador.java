package ud3.partido;

public class Jugador {
    
    String nombre;
    int dorsal;
    Pelota pelota;

    public Jugador(String nombre, int dorsal, Pelota pelota){
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.pelota = pelota;
    }

    public void pasarPelota(Jugador p){
        if(this.pelota == null){
            return;
        }
        this.pelota.chutar();
        p.pelota = this.pelota;
        this.pelota = null;
    }
}
