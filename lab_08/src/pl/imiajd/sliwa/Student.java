package pl.imiajd.sliwa;

import java.time.LocalDate;

public class Student extends Osoba{
    private double sredniaOcen;
    public Student(String[] imiona, String nazwisko, LocalDate dataUrodzenia, boolean plec, double sredniaOcen) {
        super(imiona, nazwisko, dataUrodzenia, plec);
        this.sredniaOcen = sredniaOcen;
    }
    public void setSredniaOcen(double sredniaOcen){
        this.sredniaOcen = sredniaOcen;
    }
    public double getSredniaOcen(){
        return sredniaOcen;
    }
    @Override
    public String toString(){
        return "Imiona: " + super.getImiona()[0] + " " + super.getImiona()[1] + ", Nazwisko: " + super.getNazwisko() + ", Data urodzin: " + super.getDataUrodzenia() + ", Średnia ocen: " + sredniaOcen;
    }
}
