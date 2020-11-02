import java.time.LocalDate;
import java.util.*;

public class PracownikDemo1 {
    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;
    public void Pracownik(String nazwisko, double pobory, int year, int month, int day){
        this.nazwisko = nazwisko;
        this.pobory = pobory;
        GregorianCalendar kalendarz = new GregorianCalendar(year, month-1, day);
        this.dataZatrudnienia = kalendarz.getTime();
    }
    public String nazwisko(){
        return this.nazwisko;
    }
    public double pobory(){
        return this.pobory;
    }
    public LocalDate dataZatrudnienia(){
        return this.dataZatrudnienia;
        // łamie zasade hermetyzacji
        // return (Date)dataZatrudnienia.clone()
    }
    public void zwiekszPobory(double procent){
        this.pobory = this.pobory + (this.pobory * procent)/100;
    }
}
