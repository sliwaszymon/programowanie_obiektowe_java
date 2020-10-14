import java.util.Scanner;

public class Zad7 {
    static Scanner in = new Scanner(System.in);
    static void zad(){
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        double[] tab = new double[n];
        for (int i = 0; i<n; i++){
            System.out.printf("Podaj %d liczbę: ", i+1);
            tab[i] = in.nextDouble();
            if(i>0 && tab[i-1]>0 && tab[i]>0){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
}
