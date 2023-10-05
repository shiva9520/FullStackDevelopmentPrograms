import java.util.Scanner;

public class DiscountCalculator {
    static float discountCalculator(float bill){
        float discount=0;
        if(bill<=5000)discount=bill*(5/100);
        else if(bill<=10000)discount=bill*(10/100);
        else if(bill<=20000)discount=bill*(15/100);
        else discount=bill*25/1000;
        return discount;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String name=sc.nextLine();
        System.out.println("Enter the bill Amount ");
        float bill=sc.nextFloat();
        float discount=discountCalculator(bill);
        float total=bill-discount;
        System.out.println("=====Bill Receipt=====");
        System.out.println("Customer Name :"+name);
        System.out.println("  Bill Amount :"+bill);
        System.out.printf(("     Discount :%.2f%n"),discount);
        System.out.printf(("        Total :%.2f%n"),total);
        sc.close();
    }
}
