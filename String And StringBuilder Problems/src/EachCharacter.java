import java.sql.SQLOutput;
import java.util.Scanner;

public class EachCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
