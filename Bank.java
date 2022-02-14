import java.util.Date;
import java.util.Scanner;
public class Bank  {


    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in); // create scanner in system
        System.out.print("Enter annual interest rate, for example, 8.25:");
        double inputRate = sc.nextDouble();

        System.out.print("Enter number of years as an integar:");
        int inputYears = sc.nextInt();

        System.out.print("Enter loan amount, for example, 12000.95:");
        double inputLoanAmt = sc.nextDouble();

        Loan housing1 = new Loan();

        System.out.println(" The loan was created on" + " " + housing1.getLoanDate());
        System.out.println(" The monthly payment is" + " " + housing1.getMonthlyPayment());
        System.out.println(" The total payment is" + " " + housing1.getTotalPayment());



    }

}
