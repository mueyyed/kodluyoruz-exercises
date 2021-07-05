import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Year to detect it whether it is leap or not");
        year=scanner.nextInt();

        if(year % 400 ==0)
            System.out.println(" Artik year");
        else if(year % 100==0)
            System.out.println("Artik yil degil");
        else if(year%4==0)
            System.out.println("Artik year");
        else
            System.out.println("not Artik year ");
    }
}
