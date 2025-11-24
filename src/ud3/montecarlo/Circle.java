package ud3.montecarlo;

public class Circle extends Shape {
    private double r;

    public Circle(double radius){
        this.r = radius;
    }

    /**
     * Devuelve un booleano en función de si el punto está dentro o fuera del círculo.
     * @param p Punto a evaluar
     * @return Verdadero si el punto está dentro o en el borde.
     */
    public boolean isIn(Point p){
        double rSquare = Math.pow(this.r, 2);
        double lenSquare = Math.pow(p.getX(),2) + Math.pow(p.getY(),2);
        return rSquare >= lenSquare;
    }
    
}
