package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
    private double sredniaOcen;
    public Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen){
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    @Override
    public int compareTo(Osoba o){
        if ((super.compareTo(o) == 0)&&(o instanceof Student)){
            if (this.sredniaOcen == ((Student) o).sredniaOcen){
                return 0;
            }
        }
        return 1;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + " [" + super.getNazwisko() + ", " + super.getDataUrodzenia() + ", " +this.sredniaOcen +"]";
    }
}
