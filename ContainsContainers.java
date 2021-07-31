import java.util.Scanner;

public class ContainsContainers {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int user = scnr.nextInt();
     String[] words = new String[user];
     String temp = scnr.next();
     char letter;
     
     for (int i = 0; i < words.length; i++){
       if (temp.length() < 2){
         break;
       }
       words[i] = temp;
       temp = scnr.next();
     }
     letter = temp.charAt(0);
     
     for (int i = 0; i < words.length; i++){
       if (words[i].indexOf(letter) != -1){
         System.out.println(words[i]);
        }
      } 
   }
}


