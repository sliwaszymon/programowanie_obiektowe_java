package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate dataProdukcji){
        super(producent, dataProdukcji);
    }
    @Override
    public void dzwiek(){
        System.out.println("Li li li.");
    }
}
