package homework;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
import java.util.Scanner;

public class Program3 {


        public static void main (String args []){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = in.nextLine();
        System.out.print("Enter roll no of student: ");
        int r = in.nextInt();
        System.out.print("Enter marks in Maths subject: ");
        int Maths = in.nextInt();
        System.out.print("Enter marks in Science subject: ");
        int Science = in.nextInt();
        System.out.print("Enter marks in English subject: ");
        int English = in.nextInt();
        System.out.println("pass");
       String result = in.nextLine();


        int t = Maths + Science + English;
        double p = t / 300.0 * 100.0;
        String g = "";
        if (p >= 80 && result =="Pass")
            g = "A+";
        else if (p >= 60 && result =="Pass")
            g = "A";
        else if (p >= 50 && result =="Pass")
            g = "B";
        else if (p >= 35 && result =="Pass")
        g = "C";
        else if (p <= 35 && result =="Fail")
            g = "";





        System.out.println("Total Marks = " + t);
        System.out.println("Percentage = " + p);
        System.out.println("Grade = " + g);
        System.out.println("Result : " + result);


            System.out.println("|______________________________________|");
            System.out.println("|        Mark Sheet                    | ");
            System.out.println("|______________________________________|");
            System.out.println("|   Name            :" +name+"         |");
            System.out.println("|   Roll No         :" +r+"            |");
            System.out.println("|                                      |");
            System.out.println("|______________________________________|");
            System.out.println("|   Subject             Marks          |");
            System.out.println("|______________________________________|");
            System.out.println("|   Maths           :" +Maths+"        |");
            System.out.println("|   Science         :" +Science+"      |");
            System.out.println("|   English         :" +English+"      |");
            System.out.println("|                                      |");
            System.out.println("|______________________________________|");
            System.out.println("|________Total___________:" +t+"_______|");
            System.out.println("|        Percentage      :" +p+"       |");
            System.out.println("|        Result          :"+result+"   |");
            System.out.println("|        Grade           :" +g+"       |");
            System.out.println("|______________________________________|");


    }

    }
