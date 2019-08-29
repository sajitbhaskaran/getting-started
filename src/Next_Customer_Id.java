import java.util.Scanner; // Make the Scanner class available
public class Next_Customer_Id {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); // Create the scanner
        int no_of_customers = stdin.nextInt();
        int[] customer_id; // Declare array variable for customer ids.
        customer_id = new int[no_of_customers];
        customer_id[0] = stdin.nextInt();
        int max = customer_id[0]; // Set the first customer id as the highest id.
        int i; // The array index.
        
        for ( i = 1; i < customer_id.length; i++) {
        customer_id[i] = stdin.nextInt();
        if (customer_id[i] > max) {
        max = customer_id[i];
        }
        }
        int id_new_customer = max + 1;
        System.out.println("Next customer id is " + id_new_customer);
	} // end of main
} // end of class Next_Customer_Id
