import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args){
        ArrayList<LocalDate> locDateTest = new ArrayList<>();
        locDateTest.add(LocalDate.of(2011,4,7));
        locDateTest.add(LocalDate.of(1997,2,7));
        locDateTest.add(LocalDate.of(2115,11,11));
        locDateTest.add(LocalDate.of(2137,4,2));
        System.out.println(ArrayUtil.isSorted(locDateTest));
        Collections.sort(locDateTest);
        System.out.println(ArrayUtil.isSorted(locDateTest));

        ArrayList<Integer> intTest = new ArrayList<>();
        intTest.add(2);
        intTest.add(1);
        intTest.add(1);
        intTest.add(5);
        intTest.add(2);
        intTest.add(1);
        intTest.add(3);
        intTest.add(7);
        System.out.println(ArrayUtil.isSorted(intTest));
        Collections.sort(intTest);
        System.out.println(ArrayUtil.isSorted(intTest));

        System.out.println(ArrayUtil.binSearch(intTest,5)); // 3 przed sortem, 6 po sorcie
        System.out.println(ArrayUtil.binSearch(locDateTest,LocalDate.of(1997,4,11)));
        System.out.println(ArrayUtil.binSearch(locDateTest,LocalDate.of(2115,11,11)));

//        ArrayUtil.selectionSort(locDateTest);
//        ArrayUtil.selectionSort(intTest);
//        ArrayUtil.mergeSort(locDateTest);
//        ArrayUtil.mergeSort(intTest);

    }
}
