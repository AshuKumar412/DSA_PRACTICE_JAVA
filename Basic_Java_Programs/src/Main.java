import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary : ");
        int salary = sc.nextInt();
        if(salary>10000){
            System.out.println("Salary with bonus : "+(salary+2000));
        }else{
            System.out.println("Salary with bonus : "+(salary+1000));
        }
    }
}