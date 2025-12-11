package aoc.puzle2;

public class Range {
    private long start;
    private long end;
    private long current;

    public Range(String range){
        String[] subs = range.split("-");
        if(subs.length != 2){
            System.err.println("El rango especificado es invalido: " + range);
            System.exit(1);
        }
        try{
            this.start = Long.parseLong(subs[0]);
            this.end = Long.parseLong(subs[1]);
            this.current = this.start;
        }
        catch(NumberFormatException e){
            System.err.println("El rango no posee el formato correcto(xxxx-xxxx): " + range);
            System.exit(1);
        }
    }

    public boolean hasNext(){
        return this.current <= this.end;
      
    }

    public String next(){
        String result = null;
        if(this.hasNext()){
            result = Long.toString(this.current);
            this.current++;
        }
        return result;
    }

    public static void main(String[] args) {
        Range r = new Range("222-333");
        while(r.hasNext()){
            System.out.println(r.next());
        }
    }

    
}
