package week8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Claire Francis, Week8Program2, October 24, 2025

// Assign (i.e hardcode) two maps, with at least 5 users in each map.  
//  The first map has a list of user names & passwords. 
// The second map has a list of user names & short messages. 
//   The user is asked to login in with user user name & password.  
// If the login is correct, the program will print the short message for that person. 
// If the login is not correct, an error message will be displayed and the program will end.
// For example the two maps might be something like:

// {"hysmith" = "sm8byebye",  "tgnelson" = "SnB8ky", "rdokafor" = "n!@hyj"} 

// {"hysmith" = "Hi Henry.  Please call be by 7:00 this evening.",  "tgnelson" = "What is up dog?", "rdokafor" = "This is Jill.  Are you coming to my birthday party?"}

public class Week8Program2 {

	public static void main(String[] args) {
        Map<String, String> userPasswords = new HashMap<>();
        userPasswords.put("Unicorn", "7493");
        userPasswords.put("43548fn", "fnjvkds33");
        userPasswords.put("Hello", "monkey");
        userPasswords.put("giraffe", "glitter");
        userPasswords.put("flowers482", "nvjdske3");

        // Map 2: usernames and messages
        Map<String, String> userMessages = new HashMap<>();
        userMessages.put("Unicorn", "Hello, please don't forget to bring the magic fairy dust. ");
        userMessages.put("43548fn", "What is your favorite color?");
        userMessages.put("Hello", "Bring me the chocolate cake with a side of ice cream.");
        userMessages.put("giraffe", "You get to eat at Misono's.");
        userMessages.put("flowers482", "You get to eat Chipotle.");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the User Login System ===");

        // Ask for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Ask for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check login credentials
        if (userPasswords.containsKey(username) && userPasswords.get(username).equals(password)) {
            // Successful login
            System.out.println("\nLogin successful!");
            System.out.println("Your message: " + userMessages.get(username));
        } else {
            // Login failed
            System.out.println("\nError: Invalid username or password.");
            System.out.println("Program will now exit.");
        }

        scanner.close();
    }


	}


