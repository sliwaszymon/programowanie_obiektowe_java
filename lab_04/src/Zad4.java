import java.math.BigInteger;

public class Zad4 {
    public static void ziarnkoDoZiarnka(int n){
        // https://www.youtube.com/watch?v=ILWKUMZHrJ4
        BigInteger ziarnka = new BigInteger("1");
        BigInteger wynik = new BigInteger("1");
        BigInteger mnoznik = new BigInteger("2");

        for(int i = 0; i < n*n-1; i++){
            ziarnka = ziarnka.multiply(mnoznik);
            wynik = wynik.add(ziarnka);
        }

        System.out.println(wynik.toString());
    }
}
