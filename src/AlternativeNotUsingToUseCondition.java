import java.util.Scanner;

public class AlternativeNotUsingToUseCondition {
    public static void main(String[] args) {

        int temperature=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter temperature");
        temperature=scanner.nextInt();

        // here is to include all values < 5
        if(temperature<5)
            temperature=4;

        switch(temperature)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Kayak");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Sinema");
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                System.out.println("Piknik");
                break;
            default:
                System.out.println("YUZME");
                break ;
        }
    }
}
