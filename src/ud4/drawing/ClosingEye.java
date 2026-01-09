package ud4.drawing;

import java.awt.Color;
import java.awt.Graphics;

public class ClosingEye {
    private Integer x;
    private Integer y;
    private Integer width;
    private Integer height;
    final private Integer maxHeight;
    final private Integer minHeight;
    private Float hue;
    private Integer updateDir = -2;

    public ClosingEye(Integer x, Integer y, Integer width){
        this.x = x;
        this.y = y;
        this.width = width;
        this.maxHeight = (width * 40) / 100;
        this.minHeight = 1;
        this.height = this.maxHeight;
        this.hue = 0.0f;

    }

    private Float nextColor(){
        this.hue += 0.01f;
        return this.hue;
    }

    public void updateHeight(){
        this.height += this.updateDir;
        if (this.height <= this.minHeight){
            this.updateDir *= -1;
            this.height = this.minHeight;
        }
        else if (this.height >= this.maxHeight){
            this.updateDir *= -1;
            this.height = this.maxHeight;
        }

    }

    public void draw(Graphics surface){
        Color c = Color.getHSBColor(this.nextColor(), 1.0f, 1.0f);
        Color prevColor = surface.getColor();
        surface.setColor(c);
        surface.fillOval(this.x, this.y, this.width, this.height);
        surface.setColor(Color.BLACK);
        if(this.height < 10){
            surface.fillOval(this.x + this.width / 2 - this.height / 2, this.y, this.height, this.height);
        }
        else{
            surface.fillOval(this.x + this.width / 2 - 5, this.y + this.height / 2 - 5, 10, 10);
        }
        
        surface.setColor(prevColor);
        this.updateHeight();
    }
        
    
    
}
