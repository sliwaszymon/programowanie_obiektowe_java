import java.util.ArrayList;

public class Zad3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> c = new ArrayList<Integer>();
        int a_pos = 0;
        int b_pos = 0;
        // Tworzenie tablicy z wstępnym sortowaniem
        for(int i = 0; i < a.size() + b.size(); i++){
            if(a_pos == a.size()){
                c.add(b.get(b_pos));
                b_pos += 1;
            }
            else if(b_pos == b.size()){
                c.add(a.get(a_pos));
                a_pos += 1;
            }
            else{
                if(a.get(a_pos)>=b.get(b_pos)){
                    c.add(b.get(b_pos));
                    b_pos += 1;
                }
                else{
                    c.add(a.get(a_pos));
                    a_pos += 1;
                }
            }
        }
        // Sortowanie bąbelkowe powstałej, częściowo posortowanej tablicy
        // Nie sprawdzałem, jest duża szansa że wywołanie metody merge(a, b)
        // i posortowanie bąbelkowe zwróconej tablicy było by wydajniejsze
        // ale chciałem przetestować pomysł na który wpadłem przed snem
        // i ostatecznie jakoś tak wyszło, że z jego pozostałości powstał ten kod
        for (int i = 0; i < c.size(); i++){
            for(int j = 1; j < c.size()-1; j++){
                if (c.get(j-1)>c.get(j)){
                    int temp = c.get(j-1);
                    c.set(j-1, c.get(j));
                    c.set(j, temp);
                }
            }
        }
        return c;
    }
}
