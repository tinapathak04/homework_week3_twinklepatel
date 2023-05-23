package homework;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
    import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
    myMethod();
    }
    public static void myMethod(){
        Scanner tv = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = tv.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
