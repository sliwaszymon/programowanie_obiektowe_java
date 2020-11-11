package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Flet extends Instrument {
    public Flet(String producent, LocalDate dataProdukcji){
        super(producent, dataProdukcji);
    }
    @Override
    public void dzwiek() {
        System.out.println("Fi fi fi");
    }
}
