/*
  Name  : Sujoy Chandra Das
  ID    : 2012020269
  Section : f
  email : cse_2012020269@lus.ac.bd
  Date  : 16-10-2021

 */
package sujoy;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        AdvancedArithmetic math = new MyCalculator();

        System.out.print("Enter a number to find divisor of sum: ");
        int a = input.nextInt();
        math.divisorSum(a);

        System.out.print("Enter a number to find factorial: ");
        int b = input.nextInt();
        math.findFactorial(b);
    }
}
