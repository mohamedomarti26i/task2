import java.util.Scanner;
import java.time.Year;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // q1
        System.out.print("please enter the temperature in celsius : ");
        double celsius = input.nextDouble();
        double reaumur = celsius * 4 / 5;
        System.out.println("the temperature in reaumur is : " + reaumur);

        //q2
        int currentYear = Year.now().getValue();
        System.out.print("please enter your birth year : ");
        int birthYear = input.nextInt();
        int age = currentYear - birthYear;
        System.out.println("current Year : " + currentYear);
        System.out.println("your age is : " + age );

        //q3
        System.out.print("Enter parking duration (in hours): ");
        int hours = input.nextInt();
        int totalFee = hours * 3000;
        System.out.printf("Total parking fee: Rp%,d%n" , totalFee);

        //q4
        System.out.print("Enter parking duration (in hours): ");
        int parkingHours = input.nextInt();
        int progressiveFee = 0;
        if (parkingHours > 0) {
            progressiveFee = 3000 + (parkingHours - 1) * 2000; 
        }
        System.out.printf("Progressive parking fee: Rp%,d%n", progressiveFee );
    
        //q5
        System.out.print("Enter total purchase amount (Rp): ");
        long totalAmount = input.nextLong();
        System.out.print("Enter amount paid (Rp): ");
        long amountPaid = input.nextLong();
        if (amountPaid > totalAmount) {
            long change = amountPaid - totalAmount;
            System.out.printf("Change to return: Rp%,d%n", change);
        }
    }


        }


