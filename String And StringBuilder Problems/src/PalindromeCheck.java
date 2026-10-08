import java.util.Scanner;

public class PalindromeCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char [] ch = str.toCharArray();
        boolean found = true;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(ch[i] != ch[j]){
                found = false;
                break;
            }else{
                i++;
                j--;
            }
        }
        if(found){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
