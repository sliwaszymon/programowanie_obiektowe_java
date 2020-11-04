package pl.imiajd.sliwa;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int width, int height){
        super.setSize(width, height);
        super.setLocation(0, 0);
    }
    public double getPerimeter(){
        return 2*(super.height + super.width);
    }
    public double getArea(){
        return super.height * super.width;
    }
}
