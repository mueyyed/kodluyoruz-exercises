import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String number1, number2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number 1");number1=scan.nextLine();
        System.out.println("Enter number 2");number2=scan.nextLine();
        System.out.println("Enter Operation\n(+ , - , *  , / ");
        String str;
        str=scan.nextLine();
        switch (str) {
            case "+":
                System.out.println("addition=" + ((Integer.valueOf(number1)+Integer.valueOf(number2))));
                break;
            case "-":
                System.out.println("subtraction=" + ((Integer.valueOf(number1)-Integer.valueOf(number2))));
                break;
            case "*":
                System.out.println("Multiplication=" + (Integer.valueOf(number1)*Integer.valueOf(number2)));
                break;
            case "/":
                System.out.println("division=" + (Integer.valueOf(number1)/Integer.valueOf(number2)));
                break;
            default:
                System.out.println("your input was error");
        }

    }
}
