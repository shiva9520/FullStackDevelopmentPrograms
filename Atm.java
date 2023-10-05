import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        System.out.println("---Welcome---");
        System.out.println("Enter 4-digit Pin--");
        Scanner sc=new Scanner(System.in);
        int pin=sc.nextInt();
        if(pin!=1234){System.out.println("Invalid Pin");
        return;}
        System.out.println("Enter Amount :");
        float amt=sc.nextFloat();
        System.out.println("Choose Your Option :");
        System.out.println("1.Withdrawl");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Enter your withdrawl Amount :");
                int wdl=sc.nextInt();
                if(wdl>amt)System.out.println("Insufficient Balance");
                else
                System.out.println("Your Balance is "+(amt-wdl));
                break;
            }
            case 2:{
                System.out.println("Enter Your Deposit Amount :");
                int dt=sc.nextInt();
                System.out.println("Your Current Balance :"+(dt+amt));
                break;
            }
            case 3:{
                System.out.println("Your Balance : "+amt);
                break;
            }
            case 4:break;
            default:System.out.println("Wrong Choice ....");
        }
        // sc.close();
    }    
}
