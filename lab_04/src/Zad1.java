public class Zad1 {
    public static int countChar(String str, char c){
        return (int)str.chars().filter(ch -> ch == c).count();
    }
    public static int countSubStr(String str, String subStr){
        int wynik = 0;
        if(str.isEmpty() || subStr.isEmpty() || subStr.length() > str.length()){
            return 0;
        }
        for(int i = 0; i < str.length() - subStr.length(); i++){
            if(str.substring(i, i+ subStr.length()).equals(subStr)){
                wynik +=1;
            }
        }
        return wynik;
    }
    public static String middle(String str){
        if(str.length()%2==0){
            return str.substring((str.length()/2)-1, (str.length()/2)+1);
        }
        return str.substring((str.length()/2), (str.length()/2)+1);
    }
    public static String repeat(String str, int n){
        StringBuilder wynik = new StringBuilder(str);
        for(int i = 0; i < n-1; i++){
            wynik.append(str);
        }
        return wynik.toString();
    }
    public static int[] where(String str, String subStr){
        int[] wynik = new int[countSubStr(str, subStr)];
        if(str.isEmpty() || subStr.isEmpty() || subStr.length() > str.length()){
            return wynik;
        }
        int index = 0;
        for(int i = 0; i < str.length() - subStr.length(); i++){
            if(str.substring(i, i+ subStr.length()).equals(subStr)){
                wynik[index] = i;
                index++;
            }
        }
        return wynik;
    }
    public static String change(String str){
        StringBuffer wynik = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                wynik.append(String.valueOf(str.charAt(i)).toLowerCase());
            }
            else{
                wynik.append(String.valueOf(str.charAt(i)).toUpperCase());
            }
        }
        return wynik.toString();
    }
}
