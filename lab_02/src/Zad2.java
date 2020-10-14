import java.util.Scanner;
public class Zad2 {
    static Scanner in = new Scanner(System.in);
    public void foo(){
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        double[] tablica = new double[n];
        for(int i = 0; i<n; i++){
            System.out.printf("Podaj %d liczbe:\n", i+1);
            tablica[i] = in.nextDouble();
        }
        for(int j=1; j<n; j++){
            System.out.println(tablica[j]);
        }
        System.out.println(tablica[0]);
    }
}
