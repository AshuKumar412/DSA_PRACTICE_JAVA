import java.util.Scanner;

public class LengthOfString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] ch = str.toCharArray();
        int count = 0;
        for(char value : ch){
            count++;
        }
        System.out.println(count);
    }
}
