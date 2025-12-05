package aoc.puzle2;

public class Range {
    private final long start;
    private final long end;
    private long current;

    public Range(String range){
        String[] subs = range.split("-");
        if(subs.length != 2){
            System.err.println("El rango especificado es invalido: " + range);
            System.exit(1);
        }
        try{

        }
        catch{
            
        }
        Long.parseLong(subs[0]);
    }

    
}
