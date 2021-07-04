import java.util.Scanner;

public class VücutKitle {
    public static void main(String[] args) {
        float length, weight;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz  ");
        length= scanner.nextFloat();
        System.out.println();
        System.out.println("Lütfen kilonuzu giriniz");
        weight= scanner.nextFloat();
        System.out.println("Vücut Kitle İndeksiniz : " + weight/(length*length));
    }
}
