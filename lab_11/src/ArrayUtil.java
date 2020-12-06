import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> list){
        ArrayList<T> temp = new ArrayList<>(list);
        Collections.sort(temp);
        return list.equals(temp);
    }
    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> list, T x){
        int index = 0;
        for(T object: list){
            if (object.equals(x)){
                return index;
            }
            index++;
        }
        return -1;
    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> list){
        int len = list.size();
        for (int i = 0; i < len-1; i++){
            int minIndex = i;
            for (int j = i+1; j < len; j++){
                if (list.get(j).compareTo(list.get(minIndex))<0){
                    minIndex = j;
                }
            }
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
    public static <T extends Comparable<? super T>> void mergeSort(ArrayList<T> list){
        int midIndex = (int)Math.floor(list.size()/2);
        ArrayList<T> left = new ArrayList<>();
        ArrayList<T> right = new ArrayList<>();
        for (int i = 0; i <= midIndex; i++){
            left.add(list.get(i));
        }
        for (int j = 1; j < list.size(); j++){
            right.add(list.get(midIndex+j));
        }
        mergeSort(left);
        mergeSort(right);
        int k = 0;
        int l = 0;
        int m = 0;
        while (k < left.size() && l < right.size()){
            if (left.get(k).compareTo(right.get(l))<0){
                list.set(m, left.get(k));
                 k++;
            }
            else{
                list.set(m, right.get(l));
                l++;
            }
            m++;
        }
        while (k < left.size()){
            list.set(m, left.get(k));
            k++;
            m++;
        }
        while (l < right.size()){
            list.set(m, right.get(l));
            l++;
            m++;
        }
    }
}
