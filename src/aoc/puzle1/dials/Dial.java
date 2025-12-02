package aoc.puzle1.dials;

public class Dial {
    private int counter;
    private int pos;
    protected static final int LIMITE_INF = 0;
    protected static final int LIMITE_SUP = 99;

    public Dial(int counter, int pos) {
        this.counter = counter;
        this.pos = pos; 
    }

    public Dial(){
        this.pos = 50;
        this.counter = 0;
    }

    protected void updateCounter(){
        this.counter++;
    }

    protected void updateCounter(int nTimes){
        this.counter += nTimes;
    }
    
    protected static int getPeriod(){
        return (LIMITE_SUP - LIMITE_INF) + 1;
    }

    protected int getPos(){
        return this.pos;
    }

    protected int setPos(int newPos){
        this.pos = newPos;
        return this.pos;    
    }

    protected static int getTotalSteps(String instruction){
        // Separando letra de número
        Character c = instruction.charAt(0);
        Integer steps = null;
        try{
            steps = Integer.parseInt(instruction.substring(1));
        }
        catch(NumberFormatException e){
            System.err.println("La instrucción no se pudo interpretar: " + instruction);
            System.exit(1);
        }
        // Determina si se mueve a la izquierda o derecha
        switch (c) {
            case 'R':
                steps *= 1;
                break;
            case 'L':
                steps *= -1;
                break;
            default:
                System.err.println("La instrucción no se pudo interpretar: " + instruction);
                System.exit(1);
                break;
        }
        return steps;
    }

    protected void adjustPosition(){
         if(this.pos < LIMITE_INF){
            int extra = (LIMITE_INF - this.pos) - 1;
            this.pos = LIMITE_SUP - extra; 
        } 
        else if(this.pos > LIMITE_SUP){
            int extra = (this.pos - LIMITE_SUP) - 1;
            this.pos = LIMITE_INF + extra; 
        }
    }

    public int getCounter(){
        return this.counter;
    }

    public void move(String instruction){
        Integer steps = getTotalSteps(instruction);

        // Si el número es mayor que el rango del dial, significa que da vueltas hasta la misma posición más el resto
        steps %= getPeriod();
        this.pos += steps;

        // Si nos hemos pasado de los límites, ajustamos por abajo o por arriba
        this.adjustPosition();

        // Actualizamos el contador
        if(this.pos == 0){
            this.updateCounter();
        }

    }
    
}
