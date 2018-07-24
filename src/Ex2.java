import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String password, password1 = "";

        System.out.print("Enter your new password: ");
        password = scanInput.nextLine();

        System.out.print("Enter new password again: ");
        password1 = scanInput.nextLine();

        System.out.println("Does password match? " + checkPassword(password, password1));
    }

    public static boolean checkPassword(String password, String password1) {
        return password.equals(password1);
    }
}


