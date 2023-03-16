import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=s.nextInt();
        int num1=num;
        int sum=0;
        while(num1>0){
            int rem=num1%10;
            sum=sum*10+rem;
            num1/=10;
        }
        if(sum==num){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}