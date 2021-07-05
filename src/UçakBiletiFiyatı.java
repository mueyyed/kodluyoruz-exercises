
import java.util.Scanner;

public class UçakBiletiFiyatı {

    public static void main(String[] args) {
        float distance = 0, age = 0, charge = 0.10f;
        int goingComingTravel = 0;
        float cost = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //getting  Distance
            System.out.print("Enter distance");
            distance = scanner.nextFloat();

            // getting age
            System.out.println("Enter Age");
            age = scanner.nextFloat();

//            getting yolculuk tipi
            System.out.println("select [1]--> oneWay \n"
                    + "       [2]--> roundTrip");

            goingComingTravel = scanner.nextInt();

            if (distance < 0 || age < 0) {
                if (goingComingTravel != 1 || goingComingTravel != 2) {
                    System.out.println("invalid input");
                    System.exit(0);
                }
            }
            break;
        }

        if (age < 12) {
            if (goingComingTravel == 1) {
                cost = charge * distance;
                float temp = cost * 0.5f;    // applying the indirim because of age
                cost = cost - temp;
            } else {
                cost = charge * distance;
                float temp = cost * 0.5f;   // here we hava  age<12 (0.5f)
                cost = cost - temp;
                temp = 0;

                temp = cost * 0.2f;   // travelDirection =2 (0.2f)
                cost = cost - temp;
            }

        } else if (age > 12 && age < 24) {

            if (goingComingTravel == 1) {
                cost = charge * distance;
                float temp = cost * 0.1f;
                cost = cost - temp;
            } else {
                // here we hava  age<12 (0.5f) and travelDirection =2 (0.2f)
                cost = charge * distance;
                float temp = cost * 0.1f;  // first indirim because of age
                cost = cost - temp;
                temp = 0;

                temp = cost * 0.2f;
                cost = cost - temp; // second indirim becuase of two direction
            }
        } else if (age > 65) {
            if (goingComingTravel == 1) {
                cost = charge * distance;
                float temp = cost * 0.3f;   // age indirim
                cost = cost - temp;
            } else {
                // here we hava  age<12 (0.5f) and travelDirection =2 (0.2f)
                cost = charge * distance;
                float temp = cost * 0.3f;   // age indirim
                cost = cost - temp;
                temp = 0;

                temp = cost * 0.2f; // yolculuk tipi =2
                cost = cost - temp;
            }
        } else {
            if (goingComingTravel == 1) {
                cost = charge * distance;
            } else if (goingComingTravel == 2) {
                cost = charge * distance;
                float temp = cost * 0.2f;   // travel round-trip
                cost = cost - temp;
            }
        }
        System.out.println("Final cost is : " + cost);

    }
}
