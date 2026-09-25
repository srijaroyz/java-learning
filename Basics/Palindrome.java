import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int original=n;
        int reverse=0;
        while(n>0){
            int digit=n%10;
            reverse=10*reverse+digit;
            n=n/10;
        }
        System.out.println("Reverse Number: "+reverse);
        if(original==reverse){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a Palindrome Number");
        }
        sc.close();
    }
}