import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Zad3 {
    public static int countString(String file_name, String subText){
        int wynik = 0;
        try{
            File file = new File(file_name);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                String text = read.nextLine();
                for (int i = 0; i < text.length() - subText.length() + 1; i++) {
                    if (text.substring(i, i + subText.length()).equals(subText)) {
                        wynik += 1;
                    }
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist or can't be found.");
            e.printStackTrace();
            return -1;
        }
        return wynik;
    }
}
