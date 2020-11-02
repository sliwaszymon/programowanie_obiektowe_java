public class RachunekBankowyTest {
    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);

        RachunekBankowy.setRocznaStopaProcentowa(0.04);

        saver1.obliczMiesieczneOdsetki();
        System.out.printf("%6.2f\n", saver1.getSaldo());

        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%6.2f\n", saver2.getSaldo());

        RachunekBankowy.setRocznaStopaProcentowa(0.05);

        saver1.obliczMiesieczneOdsetki();
        System.out.printf("%6.2f\n", saver1.getSaldo());

        saver2.obliczMiesieczneOdsetki();
        System.out.printf("%6.2f\n", saver2.getSaldo());
    }
}
