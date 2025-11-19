package ud3.intro;

public class Square {
    int lado = 0;

    public Square(){}

    public Square(int l){
        lado = l;
    }

    public Square(Square s){
        lado = s.lado;
    }

    public void setSide(int longitud){
        lado = longitud;
    }

    public int getSide(){
        return lado;
    }

    public double getPerimeter(){
        return lado * 4;
    }

    public double getArea(){
        return lado * lado;
    }
}
