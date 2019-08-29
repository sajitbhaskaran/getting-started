import java.util.Scanner; // Make the Scanner class available
public class Valuable_Customer {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner
    int no_of_shipments; // number of shipments made by the user per month.
    System.out.println("Enter the number of shipments per month :");
    no_of_shipments = stdin.nextInt();

    if (no_of_shipments > 20) {
    System.out.println("Valuable customer");
    } else if (no_of_shipments <=0) {
    System.out.println("Invalid Input");
    } else {
    System.out.println("Not a valuable customer");
    }
	} // end of main
} // end of class Valuable_Customer
