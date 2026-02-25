public class Array_assignment_12 {
 

   public static void main(String[] var0) {
      int[] var1 = new int[]{3, 4, 7, 2, -3};
      byte var2 = 7;
      int var3 = 0;

      for(int var4 = 0; var4 < var1.length; ++var4) {
         int var5 = 0;

         for(int var6 = var4; var6 < var1.length; ++var6) {
            var5 += var1[var6];
            if (var5 == var2) {
               ++var3;
            }
         }
      }

      System.out.println("Total Subarrays = " + var3);
   }
}