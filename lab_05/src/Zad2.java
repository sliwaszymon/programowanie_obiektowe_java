import java.util.ArrayList;

public class Zad2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        for (int i = 0; i < a.size()+b.size(); i++){
            if(i%2!=0){
                if(Math.floor((float)i/2) < b.size()) {
                    c.add(b.get((int)Math.floor((float)i/2)));
                }
                else{
                    c.add(a.get((int)Math.floor((float)i/2)));
                }
            }
            else{
                if(Math.floor((float)i/2) < a.size()) {
                    c.add(a.get((int)Math.floor((float)i/2)));
                }
                else{
                    c.add(b.get((int)Math.floor((float)i/2)));
                }
            }
        }
        return c;
    }
}
