/*
The following program calulates simple interest annually and then quarterly with respective year. The user is prompted to input required 
values for the neccessary calulations and then respective formatted tables are printed with their values.
*/
import java.util.*; // importing utility package that includes Scanner

public class Tables{
  public static final Scanner CONSOLE = new Scanner(System.in); // Scanner variable that will be used for any method ( aka class constant)
  public static void main(String[] args){
    // Declare variables by appropriate data type in this section
    double p;
    double r;
    int y;
    int q;
    int i;
    
    System.out.println("UTSA - Summer 2021 - CS1083 - Prj 1 -" +
                       " written by IVAN ALVARADO-SANTOY – clr357\n");
    // request values for appropiate variables in this section
    System.out.print("Enter original amount: ");
    p = CONSOLE.nextDouble();
    System.out.print("Enter annual interest rate: ");
    r = CONSOLE.nextDouble();
    System.out.print("Enter years: ");
    y = CONSOLE.nextInt();
    System.out.println();
    System.out.println("Year\t\tValue");  // header with desired spacing format that will be used for table
    
    for (i = 0; i <= y; i++){ // iterating per year
      double v = 0;
      v = p * (1 + i * r / 100); // calculating value
      System.out.print(i + "\t\t"); // printing year and spacing out
      System.out.printf("%7.2f\n", v); // printing formatted value 
    }
    System.out.println("\n");
    // request values for appropiate variables in this section 
    System.out.print("Enter original amount: ");
    p = CONSOLE.nextDouble();
    System.out.print("Enter annual interest rate: ");
    r = CONSOLE.nextDouble();
    System.out.print("Enter years: ");
    y = CONSOLE.nextInt();
    System.out.println();
    System.out.println("Year\t\tQ1 Value\t\tQ2 Value\t\tQ3 Value\t\tQ4 Value");
    
    for (i = 1; i <= y; i ++){ // iterating per year
      System.out.print(i + "\t\t"); // printing year and spacing out
      for (q = 1; q <= 4; q++){ // iterating per quarter
        double v = 0;
        v = p * (1 + (((i - 1.0) + (q / 4.0)) * (r / 100.0))); // calculating value
        System.out.printf("%7.2f\t\t", v); // printing value with repective quarter
      }
      System.out.println();
    }
  }
                                         
}