import java.util.Arrays;
import java.util.Scanner;

public class PairWithDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int [] arr = new int [n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int start = 0;
            int end = arr.length-1;
            boolean found = false;
            while(start < end){
                int diff = arr[end]+k;
                if(diff == arr[start]){
                    found = true;
                    break;
                }
            }
        }
    }
}
