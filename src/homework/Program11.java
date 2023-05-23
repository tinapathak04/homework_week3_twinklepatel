package homework;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11 {
    public static void main(String args[]) {

      myName();
    }

    public static void myName(){
        System.out.println("\nDivided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\n\nDivided by 3 & 5: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }
        System.out.println("\n");
    }
}
