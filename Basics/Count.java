import java.util.Scanner;
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number: ");
            numbers[i]=sc.nextInt();
        }
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=0;i<n;i++){
            if(numbers[i]>0){
                positive++;
            }else if(numbers[i]<0){
                negative++;
            }else{
                zero++;
            }
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zero: "+zero);
        sc.close();
    }
}
