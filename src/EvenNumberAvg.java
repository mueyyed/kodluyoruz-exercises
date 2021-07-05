import java.util.Scanner;

public class EvenNumberAvg {
    public static void main(String[] args) {

        int number , counterEvenNumber=0,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number limit");
        number=scanner.nextInt();
        for(int i=0; i<number ;i++)
        {
            if((i % 3) ==0 )
            {
                counterEvenNumber++; sum+=i;
            }
            if(i % 4==0){
                counterEvenNumber++; sum+=i;
            }
        }

        System.out.println("Average of even numbers divisible on 4 and three ");
        System.out.println(sum/counterEvenNumber);

    }
}
