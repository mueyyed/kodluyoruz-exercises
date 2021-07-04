import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        float armutKilos,elmaKilos,domatesKilos,muzKilos,patlicanKilos;

        float armutPrice=2.14f,
                elmaPrice=3.67f,
                domatesPrice=1.11f,
                muzPrice=0.95f,
                patlicanPrice=5.00f;
        double totalPrice=0.0;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Armut kac kilo ?  : ");armutKilos=scanner.nextFloat();
        System.out.print("Elma kac kilo ?  : ");elmaKilos=scanner.nextFloat();
        System.out.print("domates kac kilo ?  : ");domatesKilos=scanner.nextFloat();
        System.out.print("Muz kac kilo ?  : ");muzKilos=scanner.nextFloat();
        System.out.print("patlican kac kilo ?  : ");patlicanKilos=scanner.nextFloat();

        totalPrice=armutPrice*armutKilos
                +elmaPrice*elmaKilos
                +domatesPrice*domatesKilos
                +muzPrice*muzKilos+
                patlicanPrice*patlicanKilos;
        System.out.println("Total price is = "+ (float)totalPrice);

    }
}
