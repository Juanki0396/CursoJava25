package ud4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter {
    public static void main(String[] args) {
        if(args.length != 1){
            System.err.println("Debe introducir la ruta al fichero de texto");
            System.exit(1);
        }
        else if(!isFileValid(args[0])){
            System.err.println("La ruta debe ser de un fichero txt existente.");
            System.exit(1);
        }
        Map<String, Integer> counter = new HashMap<>();
        try{
            for(String line : Files.readAllLines(Path.of(args[0]))){
                for(String word : line.strip().split("\\W+")){
                    word = word.toLowerCase();
                    if(counter.containsKey(word)){
                        counter.put(word, counter.get(word) + 1);
                    }
                    else{
                        counter.put(word, 1);
                    }
                }
            }
        }
        catch(IOException e){
            System.err.println("An error happened while reading the file.");
            System.exit(1);
        }

        List<Entry<String,Integer>> listCounter = new ArrayList<>(counter.entrySet());
        listCounter.sort(Entry.comparingByValue());
        
        for (Entry<String,Integer> e : listCounter.reversed().subList(0, 5)){
            System.out.printf("Palabra: %s   -----> Nº veces: %d\n", e.getKey(), e.getValue());
        }
    }

    public static boolean isFileValid(String path){
        Path p = Path.of(path);
        return path.endsWith(".txt") && p.toFile().exists();
    }
    
}
