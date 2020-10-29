import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Zad2 {
    public static int countChar(String file_name, char x){
        int wynik = 0;
        try{
            File file = new File(file_name);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                String text = read.nextLine();
                wynik += (int)text.chars().filter(ch -> ch == x).count();
            }
            read.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exist or can't be found.");
            e.printStackTrace();
            return -1;
        }
        return wynik;
    }
}
