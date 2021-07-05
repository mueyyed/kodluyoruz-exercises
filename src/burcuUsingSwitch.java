import java.util.Scanner;

public class burcuUsingSwitch {
    {
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

        switch (month) {
            case 1:
                //            Oğlak Burcu : 22 Aralık - 21 Ocak
            {
                if (day >= 1 && day <= 21)
                    System.out.println("Oğlak Burcu ");
                else if (day >= 22 && day <= 31)
                    System.out.println("Kova Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 2:
                //      Balık Burcu : 20 Şubat - 20 Mart
            {
                if (day >= 1 && day <= 19)
                    System.out.println("Kova Burcu ");
                else if (day > 19 && day <= 29)
                    System.out.println("Ballik Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 3: {
                if (day >= 20 && day <= 31)
                    System.out.println("Ballik Burcu");
                else if (day >= 1 && day <= 21)
                    System.out.println("Koç Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 4:
                //        Koç Burcu : 21 Mart - 20 Nisan
            {
                if (day >= 1 && day <= 20)
                    System.out.println("Koç Burcu");
                else if (day >= 21 && day < 31)
                    System.out.println("Boğa Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 5:
                //Boğa Burcu : 21 Nisan - 21 Mayıs
            {
                if (day >= 1 && day <= 21)
                    System.out.println("Boğa Burcu");
                else if (day > 22 && day <= 31)
                    System.out.println("İkizlerBurcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 6:
                //        İkizler Burcu : 22 Mayıs - 22 Haziran
            {
                if (day >= 1 && day <= 22)
                    System.out.println("İkizlerBurcu");
                else if (day >= 23 && day < 31)
                    System.out.println("Yengeç Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 7:
                //Yengeç Burcu : 23 Haziran - 22 Temmuz
            {
                if (day >= 1 && day <= 22)
                    System.out.println("Yengeç Burcu");
                else if (day >= 23 && day <= 31)
                    System.out.println("Aslan Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 8:
                //   Aslan Burcu : 23 Temmuz - 22 Ağustos
            {
                if (day > 22 && day <= 31)
                    System.out.println("Aslan Burcu");
                else if (day >= 23 && day <= 31)
                    System.out.println("Başak Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 9:
                //   Başak Burcu : 23 Ağustos - 22 Eylül
            {
                if (day >= 1 && day <= 22)
                    System.out.println("Başak Burcu");
                if (day >= 23 && day <= 30)
                    System.out.println("Terazi Burcu ");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 10:
                //        Terazi Burcu : 23 Eylül - 22 Ekim
            {
                if (day >= 22 && day < 31)
                    System.out.println("Terazi Burcu ");
                else if (day >= 23 && day <= 30)
                    System.out.println("Akrep Burcu");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 11:
                //        Akrep Burcu : 23 Ekim - 21 Kasım
            {
                if (day >= 21 && day < 31)
                    System.out.println("Akrep Burcu ");
                else if (day >= 1 && day <= 22)
                    System.out.println("Yay Burcu ");
                else {
                    System.out.println("invalid day");
                }
            }
            break;
            case 12:
                //        Yay Burcu : 22 Kasım - 21 Aralık
            {
                if (day >= 21 && day <= 31)
                    System.out.println("Yay Burcu ");
                else if (day >= 1 && day <= 22) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("invalid day");
                }
            }
            break;
            default: {
                System.out.println("invalid month");
            }
            break;

        }
    }
}

