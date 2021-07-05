import java.util.Scanner;

public class ÇinZodyağı {
    public static void main(String[] args) {
        int birthDay;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birthday ");
        birthDay=scanner.nextInt();
        switch (birthDay % 12)
        {
            case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavsan");
                break;
            case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yilan");
                break;
            case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
                break;
            default:
                System.out.println("invalid");

        }

    }
}
