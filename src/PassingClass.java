import java.util.Scanner;

public class PassingClass {
    public static void main(String[] args) {
       float Matematik=0, Fizik=0, Türkçe=0, Kimya=0, Müzik=0;
       float average , sumMarks=0;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Matematik mark");
          Matematik=scanner.nextFloat();
        System.out.println("Enter Fizik mark");
          Fizik=scanner.nextFloat();
        System.out.println("Enter Kimya mark");
          Kimya=scanner.nextFloat();
        System.out.println("Enter Muzik mark");
        Müzik=scanner.nextFloat();
        System.out.println("Enter Türkçe mark");
        Türkçe=scanner.nextFloat();

        if(Matematik>0 && Matematik<=100)
            sumMarks+=Matematik;
        if(Fizik>0 && Fizik<=100)
            sumMarks+=Fizik;
        if(Kimya>0 && Kimya<=100)
            sumMarks+=Kimya;
        if(Müzik>0 && Müzik<=100)
            sumMarks+=Müzik;
        if(Türkçe>0 && Türkçe<=100)
            sumMarks+=Türkçe;

        average=(sumMarks)/5;

        if(average>=55)
        {
            System.out.print("Tebrikler you have passed");
        }
        else
            System.out.print("Unfortunately , you have to reStudy course again ");

        System.out.println("You average is = "+ average);



    }
}
