import java.util.Scanner;

public class Homework1 {
    static final double PRICE = 4.87;

    public static void main(String[] args) {
    //convert dollars to reais for a donation

        Scanner reader = new Scanner(System.in);
        double dollarValue, reaisValue;
        System.out.println("Enter the value of your donation: $ ");
        dollarValue = reader.nextDouble();                                 //entrada
        reaisValue = dollarValue * PRICE;                                  //processamento
        //System.out.println("Your donation in Reais is R$ " + reaisValue);    //saída
        System.out.println("Your donation in Reais is R$ " + String.format("%.2f",reaisValue)); //codigo de formatacao para aumentar a casa decimal

    }
}
