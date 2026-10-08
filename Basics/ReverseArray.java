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
        int left=0;
        int  right=n-1;
        while(left<right){
            int temp=numbers[left];
            numbers[left]=numbers[right];
            numbers[right]=temp;
            left++;
            right--;
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
        sc.close();
    }
}
