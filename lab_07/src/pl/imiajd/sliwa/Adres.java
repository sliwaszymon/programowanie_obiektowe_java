package pl.imiajd.sliwa;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = 0;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public void pokaz(){
        System.out.printf(this.kod_pocztowy + " " + this.miasto);
        if(this.numer_mieszkania == 0){
            System.out.printf(this.ulica + " " + this.numer_domu);
        }
        else{
            System.out.println(this.ulica + " " + this.numer_domu + " " + this.numer_mieszkania);
        }
    }
    public boolean przed(String address){
        char[] local_address = this.kod_pocztowy.toCharArray();
        char[] addres_to_check = address.toCharArray();
        for(int i = 0; i< local_address.length; i++){
            if(Character.isDigit(local_address[i])) {
                if (addres_to_check[i] < local_address[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
