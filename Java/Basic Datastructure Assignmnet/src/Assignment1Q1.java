import java.util.Scanner;

class ArmstrongOrNot{
    public boolean armstrongCheck(int num){
        int temp=num;
        int sum=0;
        while (temp!=0) {
            int x = temp % 10;
            sum = (sum + (x * x * x));
            temp = temp/10;
        }
        return sum == num;
    }
}

public class Assignment1Q1 {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = userInput.nextInt();

        ArmstrongOrNot obj = new ArmstrongOrNot();
        boolean armstrongCheck = obj.armstrongCheck(num);
        if (armstrongCheck){
            System.out.println(num + " is an Armstrong number");
        }
        else {
            System.out.println(num +" is not an Armstrong number" );
        }


    }
}
