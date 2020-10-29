import java.math.BigDecimal;

public class Zad5 {
    public static void procSkladany(double k, double p, double n){
        BigDecimal kapital = new BigDecimal(Double.valueOf(k).toString());
        BigDecimal stopaProc = new BigDecimal(Double.valueOf(p).toString());
        BigDecimal proc = new BigDecimal("100");
        BigDecimal okres = new BigDecimal(Double.valueOf(n).toString());
        System.out.println(kapital.add(kapital.multiply(stopaProc.divide(proc.multiply(okres)))).toString());
    }
}
