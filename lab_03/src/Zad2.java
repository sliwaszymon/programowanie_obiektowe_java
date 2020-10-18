import java.util.Random;

public class Zad2 {
    public static void generuj(int[] tab, int n, int minWartosc, int maxWartosc){
        Random r = new Random();
        for(int i = 0; i < n; i++){
            tab[i] = r.nextInt(maxWartosc-minWartosc)-minWartosc;
        }
    }
    public static int ileNieparzystych(int[] tab){
        int nieparzyste = 0;
        for(int i: tab){
            if(i%2 != 0){
                nieparzyste += 1;
            }
        }
        return nieparzyste;
    }
    public static int ilePatrzystych(int[] tab){
        int parzyste = 0;
        for(int i: tab){
            if(i%2 == 0){
                parzyste += 1;
            }
        }
        return parzyste;
    }
    public static int ileDodatnich(int[] tab){
        int dodatnie = 0;
        for(int i: tab){
            if(i > 0){
                dodatnie += 1;
            }
        }
        return dodatnie;
    }
    public static int ileUjemnych(int[] tab){
        int ujemne = 0;
        for(int i: tab){
            if(i < 0){
                ujemne += 1;
            }
        }
        return ujemne;
    }
    public static int ileZerowych(int[] tab){
        int zerowe = 0;
        for(int i: tab){
            if(i == 0){
                zerowe += 1;
            }
        }
        return zerowe;
    }
    public static int ileMaksymalnych(int[] tab){
        int ile = 0;
        int maksymalna = tab[0];
        for(int i: tab){
            if(i > maksymalna){
                maksymalna = i;
                ile +=1;
            }
        }
        return ile;
    }
    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for(int i: tab){
            if(i > 0){
                suma += i;
            }
        }
        return suma;
    }
    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for(int i: tab){
            if(i < 0){
                suma += i;
            }
        }
        return suma;
    }
    public static int dlugoscMaksymaknegoCiaguDodatnich(int[] tab){
        int dlugosc = 0;
        int wynik = 0;
        for(int i: tab){
            if(i > 0){
                dlugosc+=1;
                if(dlugosc>wynik){
                    wynik = dlugosc;
                }
            }
            else{
                dlugosc=0;
            }
        }
        return wynik;
    }
    public static void signum(int[] tab){
        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                tab[i] = 1;
            }
            else if(tab[i] < 0){
                tab[i] = -1;
            }
        }
    }
    public static void odwrocFragment(int[] tab, int lewy, int prawy){
        int temp;
        for(int j = 0; j<=Math.floor((prawy-lewy)/2); j++){
            temp = tab[lewy-1+j];
            tab[lewy-1+j] = tab[prawy-1-j];
            tab[prawy-1-j] = temp;
        }
    }
}
