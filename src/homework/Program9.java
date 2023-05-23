package homework;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class Program9 {
    public static void main(String[] args) {
        tv();
    }

    public static void tv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any alphabet from A to F ");
        String alphabet = sc.nextLine();



        switch (alphabet) {
            case "A":
                System.out.println("City name is : Ahmedabad");
                break;
            case "B":
                System.out.println("City name is : Benoni");
                break;
            case "C":
                System.out.println("City name is : Chennai");
                break;
            case "D":
                System.out.println("City name is : Doha");
                break;
            case "E":
                System.out.println("City name is : El Paso");
                break;
            case "F":
                System.out.println("City name is : France");
                break;
            default:
                System.out.println("Invalid data");

        }
    }
}