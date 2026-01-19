package ud4.imgtoascii;

import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static Path getImgFile(String[] args){
        int idx = Arrays.binarySearch(args, "-s");
        if (idx == -1 || args.length == (idx + 1)){
            System.err.println("Debes especificar una imagen PGM");
            System.exit(1);
        }
        return Path.of(args[idx + 1]);
    }

    public static void main(String[] args) {
        Path fp = getImgFile(args);
        
        ImageManager imgManager = new ImageManager(fp);
        imgManager.printImg();
    }
}
