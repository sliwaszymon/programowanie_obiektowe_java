import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Zad3 {
    static Scanner in = new Scanner(System.in);
    static Random r = new Random();
    int m;
    int n;
    int k;
    int[][] a;
    int[][] b;
    int[][] c;
    public void pobierzDane(){
        System.out.println("Podaj liczbe m z zakresu od 1 do 10: ");
        this.m = in.nextInt();
        if(this.m>10 || this.m<1) {
            System.out.println("Podana liczba m nie pasuje do zakresu od 1 do 100. Podaj ją jeszcze raz: ");
            this.m = in.nextInt();
        }
        System.out.println("Podaj liczbe n z zakresu od 1 do 10: ");
        this.n = in.nextInt();
        if(this.n>10 || this.n<1) {
            System.out.println("Podana liczba n nie pasuje do zakresu od 1 do 100. Podaj ją jeszcze raz: ");
            this.n = in.nextInt();
        }
        System.out.println("Podaj liczbe k z zakresu od 1 do 10: ");
        this.k = in.nextInt();
        if(this.k>10 || this.k<1) {
            System.out.println("Podana liczba k nie pasuje do zakresu od 1 do 100. Podaj ją jeszcze raz: ");
            this.k = in.nextInt();
        }
    }
    public void uzupelnijMacierze(){
        this.a = new int[this.n][this.m];
        this.b = new int[this.k][this.n];
        this.c = new int[this.k][this.m];
        for(int i = 0; i<this.n; i++){
            for(int j = 0; j<this.m; j++){
                this.a[i][j] = r.nextInt(10)+1;
            }
        }
        for(int i = 0; i<this.k; i++){
            for(int j = 0; j<this.n; j++){
                this.b[i][j] = r.nextInt(10)+1;
            }
        }
        int temp;
        for(int i = 0; i<this.m; i++) {
            for (int j = 0; j < this.k; j++) {
                temp = 0;
                for (int l = 0; l < n; l++) {
                    temp += (this.a[l][i] * this.b[j][l]);
                }
                this.c[j][i] = temp;
            }
        }
    }
    public void wypiszMacierze(){
        for(int i = 0; i<this.n; i++){
            System.out.println();
            for(int j = 0; j<this.m; j++){
                System.out.printf("%d, ", this.a[i][j]);
            }
        }
        System.out.println();
        for(int i = 0; i<this.k; i++){
            System.out.println();
            for(int j = 0; j<this.n; j++){
                System.out.printf("%d, ", this.b[i][j]);
            }
        }
        System.out.println();
        for(int i = 0; i<this.k; i++){
            System.out.println();
            for(int j = 0; j<this.m; j++){
                System.out.printf("%d, ", this.c[i][j]);
            }
        }
    }
}
