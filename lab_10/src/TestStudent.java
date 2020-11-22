import pl.imiajd.sliwa.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args){
        ArrayList<Student> grupa = new ArrayList<>(5);
        grupa.add(new Student("Śliwa", LocalDate.of(1999, 5, 24), 4.47));
        grupa.add(new Student("Nowak", LocalDate.of(1988, 4, 14), 4.76));
        grupa.add(new Student("Jankowski", LocalDate.of(1998, 7, 9), 4.0));
        grupa.add(new Student("Kwiatkowski", LocalDate.of(1998, 7, 9), 3.71));
        grupa.add(new Student("Jankowski", LocalDate.of(1972, 5, 7), 4.41));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
