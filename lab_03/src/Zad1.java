import java.util.Scanner;
import java.util.Random;
public class Zad1 {
    Scanner in = new Scanner(System.in);
    public void pktA(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        int nieparzyste = 0;
        int parzyste = 0;
        for(int j = 0; j<n; j++){
            if (tab[j]%2==0){
                parzyste+=1;
            }
            else{
                nieparzyste+=1;
            }
        }
        System.out.printf("Nieparzyste: %d, parzyste: %d", nieparzyste, parzyste);
    }
    public void pktB(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        int ujemne = 0;
        int dodatnie = 0;
        int zerowe = 0;
        for(int j = 0; j<n; j++){
            if (tab[j]>=0){
                if(tab[j]==0){
                    zerowe+=1;
                }
                else{
                    dodatnie+=1;
                }
            }
            else{
                ujemne+=1;
            }
        }
        System.out.printf("dodatnie: %d, ujemne: %d, zera: %d", dodatnie, ujemne, zerowe);
    }
    public void pktC(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        int najwiekszy = tab[0];
        int wystapienia = 1;
        for(int j = 1; j<n; j++){
            if(tab[j]>najwiekszy){
                najwiekszy = tab[j];
                wystapienia = 1;
            }
            else if(tab[j]==najwiekszy){
                wystapienia+=1;
            }
        }
        System.out.printf("Najwieksza: %d, wystapienia: %d", najwiekszy, wystapienia);
    }
    public void pktD(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        int sum_dod = 0;
        int sum_uj = 0;
        for(int j = 0; j<n; j++){
            if (tab[j]>=0){
                sum_dod+=tab[j];
            }
            else{
                sum_uj+=tab[j];
            }
        }
        System.out.printf("Suma dodatnich: %d, Suma ujemnych: %d", sum_dod, sum_uj);
    }
    public void pktE(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        int dlugosc = 0;
        int wynik = 0;
        for(int j = 0; j<n; j++){
            if(tab[j]>0){
                dlugosc+=1;
                if(dlugosc>wynik){
                    wynik = dlugosc;
                }
            }
            else{
                dlugosc=0;
            }
        }
        System.out.printf("Dlugosc fragmentu: %d", wynik);
    }
    public void pktF(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        for(int j = 0; j<n; j++){
            if (tab[j]>0){
                tab[j]=1;
            }
            else{
                tab[j]=-1;
            }
        }
        System.out.print("[");
        for(int k = 0; k<n; k++){
            if(k == n-1){
                System.out.printf("%d]\n", tab[k]);
            }
            else{
                System.out.printf("%d, ", tab[k]);
            }
        }
    }
    public void pktG(){
        System.out.println("Podaj liczbe z zakresu 1<=n<=100: ");
        int n = in.nextInt();
        if(n>100 || n<1) {
            System.out.println("Podana liczba nie pasuje do zakresu 1<=n<=100. Podaj ją jeszcze raz: ");
            n = in.nextInt();
        }
        int[] tab = new int[n];
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(1998)-999;
        }
        System.out.print("[");
        for(int k = 0; k<n; k++){
            if(k == n-1){
                System.out.printf("%d]\n", tab[k]);
            }
            else{
                System.out.printf("%d, ", tab[k]);
            }
        }
        System.out.println("Podaj lewą granicę odwracania: ");
        int lewy = in.nextInt();
        System.out.println("Podaj lewą granicę odwracania: ");
        int prawy = in.nextInt();
        int temp;
        for(int j = 0; j<=Math.floor((prawy-lewy)/2); j++){
            temp = tab[lewy-1+j];
            tab[lewy-1+j] = tab[prawy-1-j];
            tab[prawy-1-j] = temp;
        }
        System.out.print("[");
        for(int k = 0; k<n; k++){
            if(k == n-1){
                System.out.printf("%d]\n", tab[k]);
            }
            else{
                System.out.printf("%d, ", tab[k]);
            }
        }
    }
}
