public class RachunekBankowy {
    static double rocznaStopaProcentowa;
    private double saldo;
    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }
    void obliczMiesieczneOdsetki(){
        this.saldo = this.saldo + (this.saldo * rocznaStopaProcentowa)/12;
    }
    static void setRocznaStopaProcentowa(double rsp){
        rocznaStopaProcentowa = rsp;
    }
    double getSaldo(){
        return this.saldo;
    }
}
