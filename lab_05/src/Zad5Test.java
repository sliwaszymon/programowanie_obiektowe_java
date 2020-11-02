import java.util.ArrayList;

public class Zad5Test {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(9);
        a.add(7);
        a.add(4);
        a.add(9);
        a.add(11);
        System.out.println(a);
        Zad5.reverse(a);
        System.out.println(a);
    }
}
