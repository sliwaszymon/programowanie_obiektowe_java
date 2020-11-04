package pl.imiajd.sliwa;

public class Osoba {
    private String nazwisko;
    private int rokUrodzenia;
    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }
    @Override
    public String toString(){
        return "Nazwisko: " + nazwisko + ", Rok urodzenia: " + rokUrodzenia;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getRokUrodzenia(){
        return rokUrodzenia;
    }
}
