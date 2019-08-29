import java.util.Scanner; // Make the Scanner class available.
public class Display_Cargo_Details {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in); // Create the Scanner  
        System.out.println("Enter the cargo details:");
        System.out.println("Enter the name");
        String name = stdin.nextLine();
        System.out.println(" Enter the description");
        String description = stdin.nextLine();
        System.out.println("Enter the length");
        Double length = stdin.nextDouble();
        System.out.println("Enter the width");
        Double width = stdin.nextDouble();
        System.out.println("The cargo details are:");  //display the cargo details
        Cargo cargo1 = new Cargo(); //create an object to store the cargo details
        cargo1.setName(name); //store the name of the cargo in the object
        cargo1.setDescription(description); //store the description of the cargo in the object
        cargo1.setLength(length); //store the length of the cargo in the object
        cargo1.setWidth(width); //store the width of the cargo in the object
        cargo1.displayCargoDetails(); 
	} // end of main
} // end of class Display_Cargo_Details
