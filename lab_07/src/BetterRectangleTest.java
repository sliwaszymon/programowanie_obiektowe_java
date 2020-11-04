import pl.imiajd.sliwa.BetterRectangle;

public class BetterRectangleTest {
    public static void main(String[] args){
        BetterRectangle prostokat = new BetterRectangle(5, 8);
        System.out.println("Obwód: " + prostokat.getArea() + ", Pole: " + prostokat.getPerimeter());
    }
}
