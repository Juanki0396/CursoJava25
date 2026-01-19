package ud4.imgtoascii;

import java.nio.file.Path;

public class ImageManager {
    private ImageLoader imageLoader;
    private Character[] asciiMap = {' ', '.', ',', '-', '+', '*', 's', '%', '$', '@'};

    public ImageManager(Path p){
        this.imageLoader = new ImageLoader(p);
    }

    public void printImg(){
        Integer[][] img = this.imageLoader.getImage();
        Integer sectorSize = this.asciiMap.length;
        Integer dynamicRange = this.imageLoader.getPixelMax() + 1;
        Integer mapper = dynamicRange / sectorSize;
        Character[][] charImg = new Character[img.length][img[0].length];
        for(int rowIdx = 0; rowIdx < img.length; rowIdx++){
            for(int colIdx = 0; colIdx < img[0].length; colIdx++){
                Integer pixel = img[rowIdx][colIdx];
                Integer charIdx = pixel / mapper;
                if (charIdx >= this.asciiMap.length) charIdx = this.asciiMap.length - 1;
                charImg[rowIdx][colIdx] = this.asciiMap[charIdx]; 
            }
        }
        for(Character[] row : charImg){
            for(Character pix : row){
                System.out.print(pix);
            }
            System.out.print("\n");
        }
    }
}
