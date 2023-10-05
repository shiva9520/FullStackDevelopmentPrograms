import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator..--");
        System.out.println("Enter the 1st nunber ");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number :");
        int num2=sc.nextInt();
        System.out.println("Enter operation lik(+,-,*,/):");
        char opr=sc.next().charAt(0);
        switch(opr){
            case '+':{
                System.out.println("Your Answer is :"+(num1+num2));
                break;
            }
            case '-':{
                System.out.println("Your Answer is :"+(num1+num2));
                break;
            }
            case '/':{
                System.out.println("Your Answer is :"+(num1+num2));
                break;
            }
            case '*':{
                System.out.println("Your Answer is :"+(num1+num2));
                break;
            }
            default:System.out.println("Wrong Choice ...");
        }
        sc.close();
    }
}
