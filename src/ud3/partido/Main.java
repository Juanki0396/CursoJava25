package ud3.partido;

public class Main {
    public static void main(String[] args){
        Double prob = Double.parseDouble(args[0]);
        Pelota pelota = new Pelota(prob);
        Jugador p1 = new Jugador("Manolo", 7, pelota);
        Jugador p2 = new Jugador("Federico", 9, null);
        int n_pases = 0;
        while(pelota.hinchada){
            if(p1.pelota == null){
                p2.pasarPelota(p1);
            }
            else{
                p1.pasarPelota(p2);
            }
            n_pases++;
        }
        System.out.println("Se han hecho " + n_pases + " pases.");
    }
}
