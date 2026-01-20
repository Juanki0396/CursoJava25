package ud4.imgtoascii;

import java.nio.file.Path;


public class ImageManager {
    private ImageLoader imageLoader;
    private Character[] asciiMap = {' ', '.', ',', '-', '+', '*', 's', '%', '$', '@'};

    public ImageManager(Path p){
        this.imageLoader = new ImageLoader(p);
    }

    private static Character[] invertArray(Character[] arr){
        Character[] lista = new Character[arr.length];
        int idxLista = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            lista[idxLista] = arr[i];
            idxLista++;
        }
        return lista;
    }

    private Character[][] loadCharImg(Character[] map){
        Integer[][] img = this.imageLoader.getImage();
        Integer sectorSize = map.length;
        Integer dynamicRange = this.imageLoader.getPixelMax() + 1;
        Integer mapper = dynamicRange / sectorSize;
        Character[][] charImg = new Character[img.length][img[0].length];
        // Transforma la imagen en caracteres
        for(int rowIdx = 0; rowIdx < img.length; rowIdx++){
            for(int colIdx = 0; colIdx < img[0].length; colIdx++){
                Integer pixel = img[rowIdx][colIdx];
                Integer charIdx = pixel / mapper;
                if (charIdx >= map.length) charIdx = map.length - 1;
                charImg[rowIdx][colIdx] = map[charIdx]; 
            }
        }
        return charImg;
    }

    /**
     * La función imprime en consola la imagen que está en el archivo pasado en el constructor.
     * La imagen se imprime con caracteres ascii.
     */
    public void printImg(){
        Character[][] charImg = this.loadCharImg(this.asciiMap);
        
        // Imprime la imagen
        for(Character[] row : charImg){
            for(Character pix : row){
                System.out.print(pix);
            }
            System.out.print("\n");
        }
    }

    /**
     * La función imprime en consola la imagen que está en el archivo pasado en el constructor.
     * La imagen se imprime con caracteres ascii.
     */
    public void printInvertedImg(){
        Character[][] charImg = this.loadCharImg(invertArray(this.asciiMap));
        
        // Imprime la imagen
        for(Character[] row : charImg){
            for(Character pix : row){
                System.out.print(pix);
            }
            System.out.print("\n");
        }
    }
}
