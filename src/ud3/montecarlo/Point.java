package ud3.montecarlo;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * @return Devuelve la coordenada x
     */
    public double getX(){
        return this.x;
    }

    /**
     * @return Devuelve la coordena y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Genera un punto de coordenadas aleatorias dentro de los límites establecidos.
     * @param xMax Límite superior eje x.
     * @param xMin Limite inferior eje x.
     * @param yMax Límite superior eje y.
     * @param yMin Límite inferior eje y.
     * @return El nuevo punto generado.
     */
    public static Point getRandomPoint(double xMax, double xMin, double yMax, double yMin){
        double xRand = (xMax - xMin) * Math.random() + xMin;
        double yRand = (yMax - yMin) * Math.random() + yMin;
        Point point = new Point(xRand, yRand);
        return point;
    }
    
}
