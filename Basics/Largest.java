import java.util.Scanner;
public class Largest {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number: ");
            numbers[i]=sc.nextInt();
        }
        System.out.print("The array: ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        int largest=numbers[0];
        for(int i=0;i<n;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.print("The largest number in the array is: "+largest);
        sc.close();
    }
}
