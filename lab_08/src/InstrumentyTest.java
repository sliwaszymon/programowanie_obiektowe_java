import pl.imiajd.sliwa.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class InstrumentyTest {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Skrzypce("Remo", LocalDate.of(2015, 11, 04)));
        orkiestra.add(new Skrzypce("Ampeg", LocalDate.of(2017, 04, 28)));
        orkiestra.add(new Flet("Heckel", LocalDate.of(2019, 07, 07)));
        orkiestra.add(new Flet("Picato", LocalDate.of(2018, 01, 11)));
        orkiestra.add(new Fortepian("Tama", LocalDate.of(2013, 05, 24)));
        for(Instrument instrument: orkiestra){
            instrument.dzwiek();
        }
        for(Instrument instrument: orkiestra){
            System.out.println(instrument);
        }
    }
}
