package ud4.imgtoascii;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.IntStream;

public class ImageLoader {
    private Path filePath;
    private String imgType;
    private Integer rows;
    private Integer cols;
    private Integer pixelMax;
    private Integer headerSize = 0;

    public ImageLoader(Path filePath) {
        this.filePath = filePath;
        this.readHeader();
    }

    private void readHeader() {
        try (BufferedReader reader = Files.newBufferedReader(this.filePath, StandardCharsets.ISO_8859_1)) {
            String firstLine = reader.readLine();
            String secondLine = reader.readLine();
            String thirdLine = reader.readLine();
            this.imgType = firstLine;
            this.cols = Integer.parseInt(secondLine.split(" ")[0]);
            this.rows = Integer.parseInt(secondLine.split(" ")[1]);
            this.pixelMax = Integer.parseInt(thirdLine);
            this.headerSize = firstLine.length() + secondLine.length() + thirdLine.length() + 3;
        } catch (IOException e) {
            System.err.printf("Error while reading file %s: %s\n", this.filePath, e.getMessage());
            System.exit(1);
        }
    }

    public Integer[][] getImage() {
        Integer[][] img = new Integer[this.rows][this.cols];
        try (InputStream reader = Files.newInputStream(this.filePath);
                DataInputStream stream = new DataInputStream(reader)) {
            stream.skipNBytes(this.headerSize);
            byte[] readerBuff = new byte[this.cols];
            for (Integer[] row : img) {
                int readBytes = stream.read(readerBuff);
                IntStream.range(0, readerBuff.length).forEach(i -> row[i] = Byte.toUnsignedInt(readerBuff[i]));
                if (readBytes != this.cols)
                    System.err.println("WARNING: Possible problems in the image loading.");
            }
            if (stream.read(readerBuff) != -1)
                System.err.println("WARNING: Some parts of the img were not loaded.");
        } catch (IOException e) {
            System.err.printf("Error while reading file %s: %s\n", this.filePath, e.getMessage());
            System.exit(1);
        }
        return img;

    }

    public Integer getPixelMax(){
        return this.pixelMax;
    }
}
