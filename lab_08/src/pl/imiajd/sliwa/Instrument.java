package pl.imiajd.sliwa;
import java.time.LocalDate;

public abstract class Instrument {
    private String producent;
    private LocalDate rokProduckji;
    public Instrument(String producent, LocalDate rokProduckji){
        this.producent = producent;
        this.rokProduckji = rokProduckji;
    }
    public abstract void dzwiek();
    public String getProducent(){
        return producent;
    }
    public LocalDate getRokProduckji(){
        return rokProduckji;
    }
    @Override
    public String toString(){
        return "Producent: " + producent + ", Rok produkcji: " + rokProduckji;
    }
}
