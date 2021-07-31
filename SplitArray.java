import java.util.*;

public class SplitArray{
   
   public static void splitArray(int[] ori, int[] mul, int[] not, int val){
      
     //System.out.println("FIX ME: splitArray Method");
     int mSize = 0; // size of real data in mul(tiple) array
     int nSize = 0; // size of real data in not(multiple) array
     for (int i = 0; i < ori.length; i++){
       if (ori[i] % val == 0){
         mul[mSize++] = ori[i];
       }
       else {
         not[nSize++] = ori[i];
       }
     }
   }
   
   
   public static void main(String[] args){
      
      Scanner scnr = new Scanner(System.in);
      
      int oSize = scnr.nextInt(); // 6
      
      int[] original = new int[oSize]; // Declaring the original array
      int[] multiple = new int[oSize/2]; // Declaring the array of multiple numbers
      int[] notMultiple = new int[oSize/2]; // Declaring the array of not multple numbers
      int value;
      
      
      // Getting the values for the original array
      for (int i = 0; i < oSize; i++){
         original[i] = scnr.nextInt();   // {7, 8, 9, 3, 6, 10}
      }
      
      value = scnr.nextInt();  // 3
      
      splitArray(original, multiple, notMultiple, value);
      
      for (int i = 0; i < oSize / 2; i++){
         System.out.printf("Multiple[%d] = %d%n", i, multiple[i]);
      }

      for (int i = 0; i < oSize / 2; i++){
         System.out.printf("Not multiple[%d] = %d%n", i, notMultiple[i]);
      }      
      
   }
   
}