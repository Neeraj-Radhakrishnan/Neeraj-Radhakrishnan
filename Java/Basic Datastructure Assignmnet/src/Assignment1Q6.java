import java.util.Scanner;

class Login{
    String userId = "Ajay",password = "password";
    public String loginUser(String user, String pass) {

            if((!(user.equals(userId))) || (!(pass.equals(password))))
                return "You have entered wrong credentials ,please enter the right credentials.";
            else
                return "Welcome " + user;

        }
    }



public class Assignment1Q6 {
    public static void main(String[] args) {
        String user;
        String pass;
        int i =1;
        while (i<=3) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter userId: ");
            user = scanner.nextLine();
            System.out.print("Enter password: ");
            pass = scanner.nextLine();

            Login obj = new Login();
            String loginUser = obj.loginUser(user, pass);
            System.out.println(loginUser);
            i++;
        }
        System.out.println("contact admin");

    }
}