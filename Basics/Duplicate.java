import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array length: ");
        int n = sc.nextInt();

        int numbers[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {

            boolean alreadyPrinted = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}
