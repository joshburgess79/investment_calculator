import java.util.Scanner;
import java.text.DecimalFormat;
public class Assign2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Scanner 
        Scanner input = new Scanner(System.in);
        
        //Recieve investment amount
        System.out.print("Enter your investment amount: ");
        int investmentAmount = input.nextInt();
        
        //Recieve monthly interest rate
        System.out.print("Enter your monthly interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate = monthlyInterestRate / 100;
        
        //Recieve number of years
        System.out.print("Enter the number of years for this investment ");
        int numberOfYears = input.nextInt();
        
        //Calculate future investment value
        double futureInvestmentValue = 
                investmentAmount *  
                Math.pow((1 + monthlyInterestRate / 12), numberOfYears * 12);
        //Format rounded output
        DecimalFormat df = new DecimalFormat("####0.00");
        
        //Print results
        System.out.println("Investment Amount: " + investmentAmount);
        System.out.println("Monthly interest rate: " + monthlyInterestRate);
        System.out.println("Number of years: " + numberOfYears);
        System.out.print("Accumulated value: " + 
                df.format(futureInvestmentValue));
    }
    
}
