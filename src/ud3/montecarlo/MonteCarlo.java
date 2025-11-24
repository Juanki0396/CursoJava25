package ud3.montecarlo;

public class MonteCarlo {
    private Square s;
    private Shape fig;

    public MonteCarlo(Square s, Shape fig){
        this.s = s;
        this.fig = fig;
    }

    public double runSimulation(int nPoints){
        double inSquare = 0;
        double inFigure = 0;
        double halfSide = this.s.getSide() / 2;
        for(int i = 0; i < nPoints; i++){
            Point p = Point.getRandomPoint(halfSide, -halfSide, halfSide, -halfSide);
            if(this.s.isIn(p)){
                inSquare += 1;
            }
            if(this.fig.isIn(p)){
                inFigure += 1;
            }
        }
        if(nPoints != inSquare){
            System.out.println("Se han perdido puntos.");
        }
        double area = (inFigure/inSquare) * this.s.getArea();
        return area;
    }

    public static void main(String[] args) {
        Circle c = new Circle(1);
        Square s = new Square(2);
        MonteCarlo mc = new MonteCarlo(s, c);
        int[] nParticles = {10, 100, 1000, 10000, 1000000};
        for(int nPoints : nParticles){
            double area = mc.runSimulation(nPoints);
            System.out.println("Simulación con " + nPoints + " puntos -> Area = " + area);
        }
        

    }
}
