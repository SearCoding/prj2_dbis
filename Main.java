import java.util.*;

class Main {
  public static void main(String[] args) {
    //Scanner
    Scanner sc = new Scanner(System.in);
    
    //Global Variables
    int numerator, denominator, reducedNumerator, quotient, remainder;

    System.out.println("Prj2 - DBIS - Fall 2023");
    System.out.println("Author: Nasir Deshields");

    System.out.println("\nThis program uses iterative subtraction to compute quotient and remainder for two integers");
    System.out.println("Enter a numerator and denominator: ");

    //Input of numerator and denominator

    numerator = sc.nextInt();
    denominator = sc.nextInt();

    //display Inputs of numerator and denominator

    System.out.println("The numerator is: " + numerator);
    System.out.println("The denominator is: " + denominator);

    //Caluclations

    quotient = 0;
    reducedNumerator = numerator;
    remainder = 0;

    while (reducedNumerator >= denominator) {
      quotient++;
      reducedNumerator -= denominator;
    }

    if(reducedNumerator > 0) {
      remainder = reducedNumerator;
    }

    System.out.print(numerator + "/" + denominator + "= " + quotient);

    if(remainder > 0){
      System.out.print("   remainder: " + remainder);
    }
    else{
      System.out.println();
    }

    System.out.print("\nThe project is done running!");
  }
}