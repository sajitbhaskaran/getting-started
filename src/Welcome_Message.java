import java.util.Scanner; // Make the Scanner class available
public class Welcome_Message {
	public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in); // Create the scanner
    
	String clientName; // name of the client.
    
	System.out.println("Enter the name");
	clientName = stdin.nextLine();
	
	System.out.println("Hello " + clientName + "! Get access to the unique shipping!");
	}
}
