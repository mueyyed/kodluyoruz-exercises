import java.util.Scanner;

public class BurcBulanCode {
    public static void main(String[] args) {
        int month, day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("select your  birthday month \n" +
                "[1]= ocak    " +
                "[2]=subat    " +
                "[3]=mart   " +
                "[4]=nisan   " +
                "[5]=mayis   " +
                "[6]=haziran\n" +
                "[7]=temmuz   " +
                "[8]=agustus  " +
                "[9]=eylul  " +
                "[10]=Ekim   " +
                "[11]=kasim  " +
                "[12]=aralik");
        month = scanner.nextInt();
        System.out.println("enter day of month");
        day = scanner.nextInt();


//        Koç Burcu : 21 Mart - 20 Nisan
        if (month == 4) {
            if (day >= 1 && day <= 20)
                System.out.println("Koç Burcu");
            else if (day >= 21 && day < 31)
                System.out.println("Boğa Burcu");
            else {
                System.out.println("invalid day");
            }
        }

        //Boğa Burcu : 21 Nisan - 21 Mayıs
        else if (month == 5) {
            if (day >= 1 && day <= 21)
                System.out.println("Boğa Burcu");
            else if (day > 22 && day <= 31)
                System.out.println("İkizlerBurcu");
            else {
                System.out.println("invalid day");
            }
        }

//        İkizler Burcu : 22 Mayıs - 22 Haziran
        else if (month == 6) {
            if (day >= 1 && day <= 22)
                System.out.println("İkizlerBurcu");
            else if (day >= 23 && day < 31)
                System.out.println("Yengeç Burcu");
            else {
                System.out.println("invalid day");
            }
        }

        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        else if (month == 7) {
            if (day >= 1 && day <= 22)
                System.out.println("Yengeç Burcu");
            else if (day >= 23 && day <= 31)
                System.out.println("Aslan Burcu");
            else {
                System.out.println("invalid day");
            }
        }

        //   Aslan Burcu : 23 Temmuz - 22 Ağustos
        else if (month == 8) {
            if (day > 22 && day <= 31)
                System.out.println("Aslan Burcu");
            else if (day >= 23 && day <= 31)
                System.out.println("Başak Burcu");
            else {
                System.out.println("invalid day");
            }
        }

        //   Başak Burcu : 23 Ağustos - 22 Eylül
        else if (month == 9) {
            if (day >= 1 && day <= 22)
                System.out.println("Başak Burcu");
            if (day >= 23 && day <= 30)
                System.out.println("Terazi Burcu ");
            else {
                System.out.println("invalid day");
            }
        }

//        Terazi Burcu : 23 Eylül - 22 Ekim
        else if (month == 10) {
            if (day >= 22 && day < 31)
                System.out.println("Terazi Burcu ");
            else if (day >= 23 && day <= 30)
                System.out.println("Akrep Burcu");
            else {
                System.out.println("invalid day");
            }
        }

//        Akrep Burcu : 23 Ekim - 21 Kasım
        else if (month == 11) {
            if (day >= 21 && day < 31)
                System.out.println("Akrep Burcu ");
            else if (day >= 1 && day <= 22)
                System.out.println("Yay Burcu ");
            else {
                System.out.println("invalid day");
            }
        }

//        Yay Burcu : 22 Kasım - 21 Aralık
        else if (month == 12) {
            if (day >= 21 && day <= 31)
                System.out.println("Yay Burcu ");
            else if (day >= 1 && day <= 22) {
                System.out.println("Oğlak Burcu");
            }
            else {
                System.out.println("invalid day");
            }
        }

//            Oğlak Burcu : 22 Aralık - 21 Ocak
        else if (month == 1) {
            if (day >= 1 && day <= 21)
                System.out.println("Oğlak Burcu ");
            else if (day >= 22 && day <= 31)
                System.out.println("Kova Burcu");
            else {
                System.out.println("invalid day");
            }
        }

        //      Balık Burcu : 20 Şubat - 20 Mart
        else if (month == 2) {
            if (day >= 1 && day <= 19)
                System.out.println("Kova Burcu ");
            else if (day > 19 && day <= 29)
                System.out.println("Ballik Burcu");
            else {
                System.out.println("invalid day");
            }
        }
        else if (month == 3) {
            if (day >= 20 && day <= 31)
                System.out.println("Ballik Burcu");
            else if (day >= 1 && day <= 21)
                System.out.println("Koç Burcu");
            else {
                System.out.println("invalid day");
            }
        }
        else {
            System.out.println("invalid month");
        }
    }
}
