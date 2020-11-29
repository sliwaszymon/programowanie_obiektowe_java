import java.util.ArrayList;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean isSorted(ArrayList<T> list){
        T temp = list.get(0);
        for(T iterator: list){
            if ((double)temp > (double)iterator){
                return false;
            }
            temp = iterator;
        }
        return true;
    }
}
