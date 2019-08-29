import java.util.Scanner; // Make the Scanner class available
public class Missing_Customer {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner
    int no_of_customers = stdin.nextInt();
    int[] customer_id; // Declare array variable for customer ids.
    customer_id = new int[no_of_customers];
    int i; // The array index.
    boolean ismissing;

    for ( i = 0; i < customer_id.length; i++) {
    customer_id[i] = stdin.nextInt();
    }
    for ( int j = 1; j < customer_id.length + 2; j++) {
    ismissing = true;
    for ( i = 0; i < customer_id.length; i++) {
    if (j == customer_id[i]) {
    ismissing = false;
    break;
    }
    }
    if (ismissing == true) {
    System.out.println("Customer id " + j + " is missing");
    break;
    }
    }
	} // end of main
} // end of class Missing_Customer
