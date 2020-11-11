package pl.imiajd.sliwa;
import java.time.LocalDate;
public class Osoba {
    private String[] imiona;
    private String nazwisko;
    private LocalDate dataUrodzenia;
    private boolean plec;
    public Osoba(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec){
        this.imiona = imiona;
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String[] getImiona(){
        return imiona;
    }
    public LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }
    public boolean getPlec(){
        return plec;
    }
    @Override
    public String toString(){
        return "Imiona: " + imiona[0] + " " + imiona[1] + ", Nazwisko: " + nazwisko + ", Data urodzin: " + dataUrodzenia;
    }

}
