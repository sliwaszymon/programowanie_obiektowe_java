package pl.imiajd.sliwa;
import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(String producent, LocalDate dataProdukcji){
        super(producent, dataProdukcji);
    }
    @Override
    public void dzwiek(){
        System.out.println("Bim plim bim");
    }
}
