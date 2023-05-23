package homework;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */


   import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
     tv();
    }
    public static void tv(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number to test");
        int number = scan.nextInt();

        scan.close();

        //ternary operator to check number
        String result = number%2==0 ? "Even" : "Odd";

        System.out.println(number +" is "+ result);

    }

}
