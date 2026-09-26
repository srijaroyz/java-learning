// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class LinearSearch {
   public LinearSearch() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         System.out.print("Enter the number: ");
         var3[var4] = var1.nextInt();
      }

      System.out.print("Enter the number to search: ");
      int var7 = var1.nextInt();
      boolean var5 = false;

      for(int var6 = 0; var6 < var2; ++var6) {
         if (var3[var6] == var7) {
            System.out.println("The number is in the array at index " + var6);
            var5 = true;
            break;
         }
      }

      if (!var5) {
         System.out.println("Not found.");
      }

      var1.close();
   }
}
