import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            numbers[i]=sc.nextInt();
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.print("The reverse array is: ");
        for(int i=n-1;i>=0;i--){
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
}
