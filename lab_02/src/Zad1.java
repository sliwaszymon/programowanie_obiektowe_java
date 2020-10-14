import java.util.Scanner;
public class Zad1 {
    static Scanner in = new Scanner(System.in);
    public void pktA() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik += x;
        }
        System.out.println(wynik);
    }
    public void pktB() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 1.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik *= x;
        }
        System.out.println(wynik);
    }
    public void pktC() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik += Math.abs(x);
        }
        System.out.println(wynik);
    }
    public double pktD() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik += Math.sqrt(Math.abs(x));
        }
        return wynik;
    }
    public double pktE() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 1.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik *= Math.abs(x);
        }
        return wynik;
    }
    public void pktF() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik += Math.pow(x,2);
        }
        System.out.println(wynik);
    }
    public void pktG() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik1 = 0.0;
        double wynik2 = 1.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            wynik1 += x;
            wynik2 *= x;
        }
        System.out.printf(wynik1 + " i " + wynik2);
    }
    public void pktH() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            if(i%2!=0) {
                wynik += x;
            }
            else{
                wynik -= x;
            }
        }
        System.out.println(wynik);
    }
    public void pktI() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0.0;
        int silnia = 1;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe:\n", i);
            double x = in.nextDouble();
            silnia *= i;
            if(i%2==0) {
                wynik += (x/silnia);
            }
            else {
                wynik -= (x/silnia);
            }
        }
        System.out.println(wynik);
    }
}
