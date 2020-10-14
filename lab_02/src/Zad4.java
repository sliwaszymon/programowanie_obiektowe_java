import java.util.Scanner;

public class Zad4 {
    static Scanner in = new Scanner(System.in);
    public void zad(){
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double wynik = 0;
        for(int i = 1; i<=n; i++) {
            System.out.printf("Podaj %d liczbę: ", i);
            double x = in.nextDouble();
            if (x>0){
                wynik += x;
            }
        }
        wynik *= 2;
        System.out.println(wynik);
    }
}
