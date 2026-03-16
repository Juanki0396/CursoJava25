package ud5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FileReader {

    public String readAll(String path) throws IOException{
        Path filePath = Path.of(path);
        String fileContent = Files.readString(filePath);
        return fileContent;
    }
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of(args[0]);
        try(Stream<String> lines = Files.lines(filePath)){
            lines.forEach(System.out::println);

        }
    }
}
