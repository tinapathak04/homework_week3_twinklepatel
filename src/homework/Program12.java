package homework;

import java.util.Scanner;
public class Program12 {

    public static void main(String[] args) {

        num();
    }

    public static void num() {
        Scanner tv = new Scanner(System.in);
        System.out.println(" Enter the value: ");
        char c = tv.next().charAt(0);


        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c + " This is an alphabet.");
        } else if (c >= '0' && c <= '9') {
            System.out.println(c + " This is a number.");
        } else {
            System.out.println("This is a Symbol");

        }
    }
}