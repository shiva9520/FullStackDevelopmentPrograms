import java.util.Scanner;

public class CountDigit {
    static int count(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        System.out.println(count(num));
        sc.close();
        
    }
}
