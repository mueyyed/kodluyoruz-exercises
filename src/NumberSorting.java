import java.util.Arrays;
import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {

        int []array=new int[3];
        Scanner scanner=new Scanner(System.in);
        for(int i=0; i<3; i++)
        {
            System.out.println("enter the number " + i+1 +" ");
            array[i]=scanner.nextInt();
        }
        System.out.println("number are sorted from big to small as follows ");
        Arrays.sort(array);
        for(int i =array.length -1; i>=0;i--)
        {
            System.out.print(array[i] + " ");
        }

        //     Vector<Integer> array = new Vector<Integer>(3);
        // we can use another sturctures to get these elements sorted
    }
}
