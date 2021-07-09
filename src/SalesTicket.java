 
import java.util.Scanner;

/*
Sinema Bileti Satışı :
-18 yaş altı için %10
-18 ve 25 yaş arası %5 indirim
-Korku filmi seçimi %10 indirim
 */

public class SalesTicket {
    static int price = 100;
    public static void main(String[] args) {


        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter your age: ");
            int age = scan.nextInt();
            System.out.print("Choose if the movie category is horror enter 1: ");
            int scary = scan.nextInt();


            if (age < 18) {
                // horor movie is forbidden for under 18
                double newPrice = price - (price * 0.10);
                System.out.println("Your Ticket Price: " + newPrice + "Dollar");
            }
            else if (age >= 18 && age <= 25 && scary != 1) {
                /*(age > 18 && age < 25) same category */
                double newPrice = price - (price * 0.10);
                System.out.println("Your Ticket Price: " + newPrice + "Dollar");
            }
            else if (age >= 18 && age <= 25 && scary == 1) {
                /*age >=19 and age age <=25 horror movie */
                double newPrice = price - (price * 0.15);
                System.out.println("Your Ticket Price: " + newPrice + "Dollar");
            }
            else if (age > 25 && scary != 1) {
                /*age >25                    */
                double newPrice = price;
                System.out.println("Your Ticket Price: " + price + "Dollar");
            } else if (age > 25 && scary == 1) {
                /*age >25 and horror movie */
                double newPrice = price - (price * 0.10);
                System.out.println("Your Ticket Price: " + price + "Dollar");
            }

        }

    }
}



