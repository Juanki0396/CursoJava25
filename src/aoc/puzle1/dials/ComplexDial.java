package aoc.puzle1.dials;

public class ComplexDial extends Dial {

    public ComplexDial(){
        super();
    }

    public void move(String instruction) {
        Integer steps = getTotalSteps(instruction);
        Integer oldPos = this.getPos();

        // Actualizamos contador por el número de vueltas
        this.updateCounter(Math.abs(steps / getPeriod()));

        // Si el número es mayor que el rango del dial, significa que da vueltas hasta la misma posición más el resto
        steps %= getPeriod();
        this.setPos(this.getPos() + steps);


        // Si nos hemos pasado de los límites, ajustamos por abajo o por arriba y actualizamos contador
        if(this.getPos() > LIMITE_SUP || this.getPos() < LIMITE_INF){
            this.adjustPosition();
            if(oldPos != 0) this.updateCounter();
        }
        else if(this.getPos() == 0){
            this.updateCounter();
        }
    }
    
}
