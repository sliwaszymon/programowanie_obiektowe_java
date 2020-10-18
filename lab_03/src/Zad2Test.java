import java.util.Random;
import java.util.Scanner;

public class Zad2Test {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Zad2.generuj(tab, n, -999, 999);

        int a = Zad2.ileNieparzystych(tab);
        int b = Zad2.ilePatrzystych(tab);
        int c = Zad2.ileDodatnich(tab);
        int d = Zad2.ileUjemnych(tab);
        int e = Zad2.ileZerowych(tab);
        int f = Zad2.ileMaksymalnych(tab);
        int g = Zad2.sumaDodatnich(tab);
        int h = Zad2.sumaUjemnych(tab);
        int i = Zad2.dlugoscMaksymaknegoCiaguDodatnich(tab);
        System.out.printf("%d, %d, %d, %d, %d, %d, %d, %d, %d", a, b, c, d, e, f, g, h, i);
    }
}
