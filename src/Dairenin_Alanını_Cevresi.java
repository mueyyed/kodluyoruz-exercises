import java.util.Scanner;

public class Dairenin_Alanını_Cevresi {
    public static void main(String[] args) {
        double pi=3.14;
        int r;
        Scanner scan =new Scanner(System.in);
        System.out.println("enter radiuis");
        r=scan.nextInt();
        System.out.println("Square is =" + pi*r*r);
        System.out.println("circumstance is =" + 2*pi*r);

        //  Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        System.out.println("daire diliminin alani ="+ (pi*(r*r))/360);
    }
}
