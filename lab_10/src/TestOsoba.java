import pl.imiajd.sliwa.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestOsoba {
    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Śliwa", LocalDate.of(1999, 5, 24)));
        grupa.add(new Osoba("Nowak", LocalDate.of(1988, 4, 14)));
        grupa.add(new Osoba("Jankowski", LocalDate.of(1998, 7, 9)));
        grupa.add(new Osoba("Kwiatkowski", LocalDate.of(1998, 7, 9)));
        grupa.add(new Osoba("Jankowski", LocalDate.of(1972, 5, 7)));
        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
