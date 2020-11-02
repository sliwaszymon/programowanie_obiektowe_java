import java.util.ArrayList;

public class Zad4Test {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(7);
        a.add(4);
        a.add(9);
        a.add(11);
        System.out.println(a);
        ArrayList<Integer> b = Zad4.reversed(a);
        System.out.println(b);
    }
}
