import pl.imiajd.sliwa.*;
public class OsobyTest {
    public static void main(String[] args){
        Osoba ziomek1 = new Osoba("Wojtyła", 1920);
        Student ziomek2 = new Student("Jankowski", 1995, "Liga Legend");
        Nauczyciel ziomek3 = new Nauczyciel("Ważniak", 1969, 2100);
        System.out.println(ziomek1.toString());
        System.out.println(ziomek2.toString());
        System.out.println(ziomek3.toString());
        System.out.println(ziomek1.getNazwisko());
        System.out.println(ziomek2.getKierunek());
        System.out.println(ziomek3.getPensja());
    }
}
