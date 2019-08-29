import java.util.Scanner; // Make the Scanner class available
public class Display_User_Details {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner

    int id; // user’s id.
    String name; // user’s name.
    String username; // user’s username.
    String password; // user’s password.
    String mobileNumber; // user’s mobile number.
    Double rating; // user’s rating.
    
    System.out.println("Enter the User Details :");
    System.out.println("Enter the id :");
    id = stdin.nextInt();
    System.out.println("Enter the name :");
    name = stdin.next();
    System.out.println("Enter the username :");
    username = stdin.next();
    System.out.println("Enter the password :");
    password = stdin.next();
    System.out.println("Enter the mobilenumber :");
    mobileNumber = stdin.next();
    System.out.println("Enter the rating :");
    rating = stdin.nextDouble();
    
    System.out.println("User details are :");
    System.out.println("Id : " + id);
    System.out.println("Name : " + name);
    System.out.println("Username : " + username);
    System.out.println("Mobile Number : " + mobileNumber);
    System.out.println("Rating : " + rating); 
	} // end of main
} // end of class Display_User_Details
