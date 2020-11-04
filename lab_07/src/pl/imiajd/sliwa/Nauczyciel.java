package pl.imiajd.sliwa;

public class Nauczyciel extends Osoba{
    private double pensja;
    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }
    @Override
    public String toString(){
        return "Nazwisko: " + super.getNazwisko() + ", Rok urodzenia: " + super.getRokUrodzenia() + ", Pensja: " + pensja;
    }
    public double getPensja(){
        return pensja;
    }
}
