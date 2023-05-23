package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Program8 {
    public static void main(String[] args) {
        tv();
    }
    public static void tv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter City Name: ");
        char ch = sc.next().charAt(0);

        if (ch == 'A') {
            System.out.println("Ahmedabad");
        } else if (ch == 'B') {
            System.out.println("Benoni");
        }
        else if (ch == 'C'){
            System.out.println("Chennai");
        }
        else if (ch == 'D') {
            System.out.println("Doha");
        }
        else if (ch =='E') {
            System.out.println("El Paso");
        }
        else if (ch =='F') {
            System.out.println("France");
        }
        else {
            System.out.println("invalid entry");
        }
    }
    }

