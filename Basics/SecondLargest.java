import java.util.Scanner;
public class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            numbers[i]=sc.nextInt();
        }
        int largest=numbers[0];
        for(int i=0;i<n;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
       
        
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if((numbers[i]<largest) && (second<numbers[i])){
                second=numbers[i];
            }
        }
        System.out.println("The second largest number is: "+second);
    }
}