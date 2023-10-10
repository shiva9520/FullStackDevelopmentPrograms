import java.util.Scanner;
public class Fibonaci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    int a=0,b=1,i=3;
    System.out.format("%d,%d,",a,b);
    while(i<=num)
      {
        int c=a+b;
        System.out.format("%d,",c);
        a=b;
        b=c;
        
        i++;
      }
      sc.close();
  }
}