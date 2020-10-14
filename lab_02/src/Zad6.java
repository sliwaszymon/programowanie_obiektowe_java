import java.util.Scanner;

public class Zad6 {
    static Scanner in = new Scanner(System.in);
    static void zad() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        System.out.println("Podaj 1 liczbe: ");
        double x = in.nextDouble();
        double najmniejsza = x;
        double najwieksza = x;
        for(int i = 1; i<n; i++){
            System.out.printf("Podaj %d liczbę: ", i+1);
            x = in.nextDouble();
            if(x>najwieksza){
                najwieksza = x;
            }
            if(x<najmniejsza){
                najmniejsza = x;
            }
        }
        System.out.printf("najwieksza: %f, najmniejsza: %f\n", najwieksza, najmniejsza);
    }
}
