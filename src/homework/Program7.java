package homework;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
import java.util.Scanner;
public class Program7 {
    public static void main(String arg[]) {
        tv();
    }
    public static void tv(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seller's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Sales ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Basic Salary: ");
        int sal = sc.nextInt();
        System.out.print("Enter Sales amount:");
        int amount = sc.nextInt();


        double commission = 0.0;
        int rate=0;

        if(amount<=10000) {
            commission = amount * 0.2;
            rate = 2;
        }
        if (amount>=10000 && amount<=20000){
            commission = amount * 0.5;
            rate = 5;
        }
        if (amount>=20000 && amount<=30000){
            commission = amount * 0.10;
            rate = 10;
        }
        if (amount>=30000 && amount<=50000){
            commission = amount* 0.35;
            rate = 35;
        }

        System.out.println("Enter commission amount :" +commission);

    }
}
