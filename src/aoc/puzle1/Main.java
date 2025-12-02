package aoc.puzle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

import aoc.puzle1.dials.ComplexDial;
import aoc.puzle1.dials.Dial;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Debes introducir 1 argumento: Ruta al input");
            System.exit(1);
        }
        Path p = Path.of(args[0]);
        File f = p.toFile();
        Dial d = new Dial();
        ComplexDial complexD = new ComplexDial();
        Scanner sc = null;
        try{
            sc = new Scanner(f);
            while (sc.hasNext()) {
                String line = sc.nextLine().strip();
                d.move(line);
                complexD.move(line);
        }
        }
        catch (FileNotFoundException e){
            System.err.println("La ruta no pertenece a un archivo: " + p.toString());
            System.exit(1);
        }
        finally {
            sc.close();
        }
        System.out.println("El contador es: " + d.getCounter());
        System.out.println("El contador complejo es: " + complexD.getCounter());
    }
}
