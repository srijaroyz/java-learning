import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n= sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the number: ");
            numbers[i]=sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int num=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(numbers[i]==num){
                System.out.println("The number is in the array at index "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Not found.");
        }
        sc.close();
    }
}
