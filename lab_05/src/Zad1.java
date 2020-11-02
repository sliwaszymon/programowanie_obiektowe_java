import java.util.ArrayList;

public class Zad1 {
    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int i = 0; i < b.size(); i++) {
            a.add(b.get(i));
        }
        return a;
    }
}
