package pl.imiajd.sliwa;

public class Student extends Osoba {
    private String kierunek;
    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }
    @Override
    public String toString(){
        return "Nazwisko: " + super.getNazwisko() + ", Rok urodzenia: " + super.getRokUrodzenia() + ", Kierunek: " + kierunek;
    }
    public String getKierunek(){
        return kierunek;
    }
}
