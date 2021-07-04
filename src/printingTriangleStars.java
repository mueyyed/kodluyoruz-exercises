import javax.swing.*;
import java.util.Scanner;

public class printingTriangleStars {

    public static void main(String[] args) {

        float a,b,c;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a ");a=scan.nextFloat();
        System.out.println("enter b "); b=scan.nextFloat();
        System.out.println("enter c "); c=scan.nextFloat();

        TriangleSquareHesapla object=new TriangleSquareHesapla(a,b,c);

        System.out.println("your triangle square is =" + object.diplaySquare());

        }
}
