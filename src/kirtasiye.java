import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class kirtasiye {


    /**
     * Bir kirtasiye dükkanina mal geliyor.
     * Kýrtasiyeci kalem, silgi gibi malzemelerin kaydini sisteme girecek.
     * soru 1: Toplam kaç adet mal aldi.
     * soru 2: Hangi maldan kaç adet aldi.
     * soru 3: Kac çesit mali var.
     */

    static List<String> productsList = new ArrayList<>();
    static int totalPencil=0;
    static int totalEraser=0;
    static int totalBook=0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-------  Product Stock Tracking------- ");
        System.out.println("stop product entry Write 'quit' ");

        while(true)
        {
            String product = scanner.nextLine();
            System.out.print("Enter the name of product: ");
            if( product.equals("pen")|| product.equals("rubber")||product.equals("book"))
            {
                AddProduct(product);
            }
            else if(product.equals("quit"))
            {
                System.out.print("Entering products was quit" + "\n");
                break;
            }
            else {
                System.out.print("This library has only---> [book... pencils.....erasers]"+ "\n");
                break;
            }
        }

        ShowList(productsList);
        System.out.println("^^^^^^^^^^^^^^^^");
        System.out.println("Number of product : "+productsList.size());
        System.out.println("Current Product List: "+ productsList);
        ProductNumber(productsList);
        ProductType(productsList);
    }
    public static void AddProduct(String product) {  // add product method
        productsList.add(product);
    }

    public static void ShowList(List<String> productsList ) {  //  product list method
        for(String product1: productsList)
        {
            System.out.println("Added Products: " +product1);
        }
    }
    public static void ProductNumber(List<String> productsList ) {  // ürün sayýsý
        for(String product1: productsList)
        {
            if(product1.equals("pen")) {
                totalPencil++;
            }
            else if(product1.equals("rubber")) {
                totalEraser++;
            }
            else if(product1.equals("book")) {
                totalBook++;
            }
        }
        System.out.println("Current Number of Pen: " +totalPencil+ " product.");
        System.out.println("Current Number of rubbers: " +totalEraser+" product.");
        System.out.println("Current Number of Books: " +totalBook+" product.");
    }
    public static void ProductType(List<String> productsList ) {  // Product kind method
        HashSet<String> typeOfProduction = new HashSet<>();
        typeOfProduction.addAll(productsList);
        System.out.println("Types of current items : " + typeOfProduction.size());
    }
}