import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {

        if (subject1Marks + subject2Marks + subject3Marks < 60 || (subject1Marks > 60 || subject2Marks > 60 || subject3Marks > 60))
            return  "Failed";

        else if (subject1Marks + subject2Marks + subject3Marks <=60)
            return "failed";

        else if (subject1Marks + subject2Marks >60|| subject2Marks+subject3Marks>60||subject3Marks+subject1Marks>60)
            return "Passed Promoted";
        else
            return "Enter the correct marks";

    }

}



public class Assignment1Q4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject1 Marks : ");
        double subject1Marks = scanner.nextDouble();
        System.out.print("Enter subject2 Marks : ");
        double subject2Marks = scanner.nextDouble();
        System.out.print("Enter subject3 Marks : ");
        double subject3Marks = scanner.nextDouble();

        ResultDeclaration obj = new ResultDeclaration();
        String results = obj.declareResults(subject1Marks,subject2Marks,subject3Marks);
        System.out.println(results);


    }
}
