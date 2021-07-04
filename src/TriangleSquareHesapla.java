import java.util.Scanner;

public class TriangleSquareHesapla {

    //        Ödev
//        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
//
//        Formül
//        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
//
//                𝑢 = (a+b+c) / 2
//
//        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

    public  float a,b,c;
    public double u,alan;
    TriangleSquareHesapla(float a,float b,float c ){
        this.a=a;
        this.b=b;
        this.c=c;
    }

        public double  calculateSquare() {
            u = (a + b + c) / 2;
            alan = u * (u - a) * (u - b) * (u - c);
            return alan;
        }
        public double diplaySquare(){
            return calculateSquare()*calculateSquare();
        }
}
