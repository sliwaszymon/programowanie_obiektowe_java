import java.util.ArrayList;

public class Zad4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> b = new ArrayList<Integer>();
        for(int i = a.size()-1; i >= 0; i--){
            b.add(a.get(i));
        }
        return b;
    }
}
