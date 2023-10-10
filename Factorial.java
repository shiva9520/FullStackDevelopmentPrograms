import java.util.Scanner;
class Factorial{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int i=1,z=1;    
    while(i<=n)
      { 
        z=z*i;
        i++;
      }
    System.out.println("The Factorial is :"+z);
    sc.close();
  }
}