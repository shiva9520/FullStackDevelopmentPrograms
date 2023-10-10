import java.util.Scanner;
public class DigitSum {
    static int sum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;}
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number :");
            int digit=sc.nextInt();
            System.out.println("your digit sum is :"+sum(digit));
            sc.close();
        }
}
