package pl.edu.uwm.po.lab01;

public class Start {
    public static void main(String[] args){
        //zad1();
        //zad2(10);
        //zad3(10);
        //zad4(1000, 6,3);
        //zad5();
        //zad69();
        //zad10();
        //zad11();
        //zad12();
    }
    public static void zad1(){
        int styczen = 31;
        int luty = 29;
        int marzec = 31;
        System.out.println(styczen + luty + marzec);
    }
    public static void zad2(int lim){
        int suma = 0;
        for(int i = 1; i <= lim; i++){
            suma += i;
        }
        System.out.println(suma);
    }
    public static void zad3(int lim){
        int iloczyn = 1;
        for(int i = 1; i <= lim; i++){
            iloczyn *= i;
        }
        System.out.println(iloczyn);
    }
    public static void zad4(int ile, int procent, int lata){
        for(int i = 1; i <= lata; i++){
            ile = ile + (ile*procent)/100;
            System.out.println(ile);
        }
    }
    public static void zad5(){
        System.out.println("+----+");
        System.out.println("|Java|");
        System.out.println("+----+");
    }
    public static void zad69(){
       System.out.println("   +   ");
       System.out.println("  + +  ");
       System.out.println(" +   + ");
       System.out.println("+-----+");
       System.out.println("| .-. |");
       System.out.println("| | | |");
       System.out.println("+-+-+-+");
    }
    public static void zad10(){
        System.out.println("Ja to jednak wolę seriale:");
        System.out.println("Breaking Bad");
        System.out.println("Prison Break");
        System.out.println("Better Call Saul");
    }
    public static void zad11(){
        System.out.println("Na ulicy Trybunalskiej");
        System.out.println("Mieszka sobie Staś Pytalski,");
        System.out.println("Co gdy tylko się obudzi,");
        System.out.println("Pytaniami dręczy ludzi.");
        System.out.println();
        System.out.println("W którym miejscu zaczyna się kula?");
        System.out.println("Co na deser gotują dla króla?");
        System.out.println("Ile kroków jest stąd do Powiśla?");
        System.out.println("O czym myślałby stół, gdyby myślał?");
        System.out.println("Czy lenistwo na łokcie się mierzy?");
        System.out.println("Skąd wiadomo, że Jurek to Jerzy?");
        System.out.println("Kto powiedział, że kury są głupie?");
        System.out.println("Ile much może zmieścić się w zupie?");
        System.out.println("Na co łysym potrzebna łysina?");
        System.out.println("Kto indykom guziki zapina?");
        System.out.println("Skąd się biorą bruneci na świecie?");
        System.out.println("Ile ważą dwa kleksy w kajecie?");
        System.out.println("Czy się wierzy niemowie na słowo?");
        System.out.println("Czy jaskółka potrafi być krową?");
        System.out.println();
        System.out.println("Dziadek już od roku siedzi");
        System.out.println("I obmyśla odpowiedzi,");
        System.out.println("Babka jakiś czas myślała,");
        System.out.println("Ale wkrótce osiwiała.");
        System.out.println("Matka wpadła w stan nerwowy");
        System.out.println("I musiała zażyć bromu,");
        System.out.println("Ojciec zaś poszedł po rozum do głowy");
        System.out.println("I kiedy powróci - nie wiadomo.");
    }
    public static void zad12(){
        System.out.println("+------------------------------------------------+");
        System.out.println("| * * * * * * * * |==============================|");
        System.out.println("|* * * * * * * * *|==============================|");
        System.out.println("| * * * * * * * * |==============================|");
        System.out.println("|* * * * * * * * *|==============================|");
        System.out.println("| * * * * * * * * |==============================|");
        System.out.println("|* * * * * * * * *|==============================|");
        System.out.println("| * * * * * * * * |==============================|");
        System.out.println("|* * * * * * * * *|==============================|");
        System.out.println("|-----------------+==============================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("|================================================|");
        System.out.println("+------------------------------------------------+");
    }
}
