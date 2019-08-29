import java.util.Scanner; // Make the Scanner class available
public class Profit_months_count {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner
    int no_of_months; // number of months.
    System.out.println("Enter the total number of months");
    no_of_months = stdin.nextInt();

    System.out.println("Enter the profit amount of shipment in each month");
    int tot_mth_profit_exceed = 0;           
    Double profit;
    int month = 0;
    while ( month < no_of_months) {
    month++;
    profit = stdin.nextDouble();
    if (profit > 100000.00) {
       tot_mth_profit_exceed++;
       }
    }
    System.out.println("Profit value has exceeded Rs. 100000 for " + tot_mth_profit_exceed + " month(s).");          
	} // end of main
} // end of class Profit_months_count
