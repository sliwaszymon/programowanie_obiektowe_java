import java.util.ArrayList;

public class Zad1Test {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println(a);
        System.out.println(b);
        Zad1.append(a, b);
        System.out.println(a);
    }
}
