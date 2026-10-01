import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                isPrime=false;
                break;
                }
            }
        }
        if(isPrime){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is not a Prime Number");
        }
        sc.close();
    }
}
