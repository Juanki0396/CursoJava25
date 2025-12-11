package aoc.puzle2;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Debes introducir 1 argumento: Ruta al input");
            System.exit(1);
        }
        Path p = Path.of(args[0]);
        File f = p.toFile();
        Scanner sc = null;
        String line = null;
        try{
            sc = new Scanner(f);
            line = sc.nextLine().strip();
        }
        catch (FileNotFoundException e){
            System.err.println("La ruta no pertenece a un archivo: " + p.toString());
            System.exit(1);
        }
        finally {
            sc.close();
        }
        
        String[] ranges = line.split(",");
        long total = 0;

        for(String rangeString : ranges){
            Range r = new Range(rangeString);
            while (r.hasNext()) {
                String idString = r.next();
                ID id = new ID(idString);
                if(!id.isValid()){
                    total += Long.parseLong(idString);
                }
            }
        }

        System.out.println("La suma de los IDs invalidos es: " + total);

    }
    
}
