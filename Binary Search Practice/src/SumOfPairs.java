import java.util.Arrays;
import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        boolean found = false;
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int sum = arr[start] + arr[end];
            if(sum == k){
                found = true;
                break;
            } else if (arr[start] + arr[end] < k) {
                start++;
            }else{
                end--;
            }
        }
        if(found){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
