import java.util.Scanner;

public class Taksimetre_Programı {

    public static void main(String[] args) {
        int KM;
        double perKM=2.20,total,statPrice=10;

        Scanner input=new Scanner(System.in);
        System.out.println("mesafeyi km cinsinden giriniz");
        KM=input.nextInt();
        total =(KM * perKM);
        total+= statPrice;

        total=(total<20)?20:total;
        System.out.println("toplam tutar "+ total);
    }

}
