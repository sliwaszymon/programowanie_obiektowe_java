package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Pracownik extends Osoba {
    private LocalDate dataZatrudnienia;

    public Pracownik(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec, LocalDate dataZatrudnienia) {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.dataZatrudnienia = dataZatrudnienia;
    }
    public LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }
    @Override
    public String toString(){
        return "Imiona: " + super.getImiona()[0] + " " + super.getImiona()[1] + ", Nazwisko: " + super.getNazwisko() + ", Data urodzin: " + super.getDataUrodzenia() + ", Data zatrudnienia: " + dataZatrudnienia;
    }
}
