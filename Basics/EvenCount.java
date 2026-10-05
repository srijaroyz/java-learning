import java.util.Scanner;
public class EvenCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number: ");
            numbers[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(numbers[i]%2==0){
                count++;
            }
        }
        System.out.println("There are "+count+" even numbers in the array.");
        sc.close();
    }
}
