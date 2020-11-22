package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;
    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }
    public String getNazwisko(){
        return this.nazwisko;
    }
    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " [" + this.nazwisko + ", " + this.dataUrodzenia.toString() + "]";
    }
    @Override
    public boolean equals(Object o){
        Osoba os = (Osoba) o;
        return (this.nazwisko.equals(os.nazwisko) && this.dataUrodzenia.equals(os.dataUrodzenia));
    }
    @Override
    public int compareTo(Osoba o) {
        if(this.nazwisko.compareTo(o.nazwisko) == 0){
            if(this.dataUrodzenia.compareTo(o.dataUrodzenia) == 0){
                return 0;
            }
        }
        return 1;
    }
}
