import pl.imiajd.sliwa.*;

import java.time.LocalDate;

public class OsobaTest {
    public static void main(String[] args){
        String[] pracownikIm = {"Maria", "Antonina"};
        String[] studentIm = {"Szymon", "Jan"};
        Pracownik os1 = new Pracownik(pracownikIm, "Kowalska", LocalDate.of(1975, 12, 21), false, LocalDate.of(2004, 07, 28));
        Student os2 = new Student(studentIm, "Śliwa", LocalDate.of(1999, 05, 24), true, 4.47);
        System.out.println(os1);
        System.out.println(os2);
    }
}
