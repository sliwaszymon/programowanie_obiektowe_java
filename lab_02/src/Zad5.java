import java.util.Scanner;

public class Zad5 {
    static Scanner in = new Scanner(System.in);
    public void zad(){
        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;
        System.out.println("Podaj ile liczb chcesz zeskanować: ");
        int n = in.nextInt();
        for(int i=0; i<n; i++){
            System.out.printf("Podaj %d liczbę: ", i+1);
            double x = in.nextDouble();
            if (x!=0){
                if(x>0){
                    dodatnie += 1;
                }
                else{
                    ujemne += 1;
                }
            }
            else{
                zera += 1;
            }
        }
        System.out.printf("dodatnie: %d, ujemne: %d, zera: %d", dodatnie, ujemne, zera);
    }
}
