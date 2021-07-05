import java.util.Scanner;

public class UserPassword {

    public static void main(String[] args) {
        String passWord="101", user="java101";
        String tempPassWord, tempUser;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your userName");
        tempUser=scanner.nextLine();
        System.out.println("enter your passWord");
        tempPassWord=scanner.nextLine();
        if(passWord.equals("101"))
        {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("Do want to change password");
            System.out.println("press [0] no\n      [1] yes");
            int temp; temp=scanner1.nextInt();
            switch(temp)
            {
                case 1:
                    do
                    {
                        System.out.println("Enter your new password");
                        tempPassWord = scanner.nextLine();
                        if (!tempPassWord.equals(passWord)) {
                            System.out.println("password is changed");
                            break;
                        } else {
                            System.out.println("you entered same old password");
                        }
                    }
                    while(true);
                    break;
                    case 0:
                        System.out.println("So program will be exit");

                        break;
            }
        }
    }
}
