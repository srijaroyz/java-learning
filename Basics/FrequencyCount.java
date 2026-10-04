import java.util.Scanner;
public class FrequencyCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number: ");
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be checked: ");
        int m=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(numbers[i]==m){
                count++;
            }
        }
        System.out.println("The number "+m+" appeared in the array "+count+" times.");
        sc.close();
    }
}
