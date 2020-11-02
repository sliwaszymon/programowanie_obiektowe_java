import java.util.ArrayList;

public class Zad5 {
    public static void reverse(ArrayList<Integer> a){
        for(int i = 0; i < (int)Math.floor((float)a.size()/2); i++){
            int temp = a.get(i);
            a.set(i, a.size()-1-i);
            a.set(a.size()-1-i, temp);
        }
    }
}
