import java.util.Scanner; // Make the Scanner class available
public class Total_Profit {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner
	int no_of_months; // number of months.
    System.out.println("Enter the number of months :");
    no_of_months = stdin.nextInt();
    if (no_of_months > 0) {
    System.out.println("Enter the profit of each month in shipment");
    int total_profit = 0;           
    int profit;
    int month = 0;
    while ( month < no_of_months) {
    month++;
    profit = stdin.nextInt();
    total_profit = total_profit + profit;
    }
    System.out.println("Total profit : " + total_profit);          
    } else {
    System.out.println("Invalid Input");
    }
	} // end of main
} // end of class Total_Profit
