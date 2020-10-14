import java.util.Scanner;

public class Zad3 {
    static Scanner in = new Scanner(System.in);
    public static int silnia(int k){
        int wynik = 1;
        for(int i=1; i<=k; i++){
            wynik *= i;
        }
        return wynik;
    }
    public void pktA() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if(x%2!=0){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktB() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if((x%3==0)&&(x%5!=0)){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktC() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if(Math.sqrt(x)%2==0){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktD() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        int[] tab = new int[n+1];
        for(int i=0; i<n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i+1);
            tab[i] = in.nextInt();
        }
        for(int k=1; k<n; k++){
            if(tab[k]<((tab[k-1]+tab[k+1])/2)){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktE() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        int[] tab = new int[n+1];
        for(int i=0; i<n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i+1);
            tab[i] = in.nextInt();
        }
        for(int k=1; k<=n; k++){
            if(Math.pow(2, k)<tab[k] && tab[k]<silnia(k)){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktF() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if(i%2!=0 && x%2==0){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktG() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if(x%2!=0 && x>0){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
    public void pktH() {
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        int wynik = 0;
        for(int i=1; i<=n; i++){
            System.out.printf("Podaj %d liczbe naturalną:\n", i);
            int x = in.nextInt();
            if(x<Math.pow(i, 2)){
                wynik+=1;
            }
        }
        System.out.println(wynik);
    }
}
