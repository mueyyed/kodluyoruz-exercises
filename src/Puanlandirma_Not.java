//1-  not first odev bu linke eklendi --->  [[----https://github.com/mueyyed/kodluyoruz-exercises/blob/master/src/kirtasiye.java-----]]
//2-  not second odev bu linke eklendi ---> [[---https://github.com/mueyyed/kodluyoruz-exercises/blob/master/src/SalesTicket.java----]]      
import java.util.Scanner;

public class Puanlandirma_Not {
    public static void main(String[] args) {

        float MidTerm,finalExam;
        float average ;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Midterm grade");
        MidTerm=scanner.nextFloat();
        System.out.println("Enter your Final grade");
        finalExam=scanner.nextFloat();

        average=MidTerm*(0.5f) + finalExam*(0.7f);

       if(average>0 && average<20)
           System.out.println("FF");
       else if(average>=20 && average<50)
           System.out.println("CB");
       else if(average>=50 && average<70)
           System.out.println("BB");
       else if(average>=70 && average<=100)
           System.out.println("AA");
    }
}
