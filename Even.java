import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    String res=(num1%2==0)?("Even"):("Odd");
    System.out.println("Your number is "+res);
        sc.close();
    }
}
