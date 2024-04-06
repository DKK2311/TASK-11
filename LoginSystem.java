import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String correctPassword = "appa";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        try {
            if (!enteredPassword.equals(correctPassword)) {
                throw new Exception("Incorrect password. Please enter your valid password");
            } else {
                System.out.println("Login Done");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * OUTPUT
Enter password: appa
Login Done
 */

