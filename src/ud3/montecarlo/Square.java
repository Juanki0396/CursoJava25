package ud3.montecarlo;

public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return this.side;
    }

    /**
     * Devuelve un booleano en función de si el punto está dentro o fuera del cuadrado.
     * @param p Punto a evaluar
     * @return Verdadero si el punto está dentro o en el borde.
     */
     public boolean isIn(Point p){  
        double halfSide = side/2;
        return (-halfSide <= p.getX() && p.getX() <= halfSide) && (-halfSide <= p.getY() && p.getY() <= halfSide);
    }

    /**
     * Devuelve el área del cuadrado.
     * @return Área calculada.
     */
    public double getArea(){
        return this.side * this.side;
    }
    
}
