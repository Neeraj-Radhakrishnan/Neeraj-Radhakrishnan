import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
        double a=10;
        double b=20;
        double c=30;
        if (ctc<=300000 && ctc >= 181001){
            double slabB;
            slabB=ctc*a/100;
            return slabB;
        }
        else if (ctc>=300001 && ctc<=500000){
            double slabC;
            slabC=ctc*b/100;
            return slabC;
        }
        else if (ctc>=500001 && ctc<=1000000){
            double slabD;
            slabD=ctc*c/100;
            return slabD;
        }
        else
            return ctc;
    }

    }


public class Assignment1Q5 {
    public  static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Ctc: ");
        int ctc = userInput.nextInt();
        String d="Nil";

        TaxAmount obj = new TaxAmount();
        double calculateTaxAmount = obj.calculateTaxAmount(ctc);
        if (ctc<=181000 && ctc>=0){
            System.out.println("Tax amount : "+d);
        }
        else {
            System.out.println(" Tax amount: "+calculateTaxAmount);
        }

        }

}
