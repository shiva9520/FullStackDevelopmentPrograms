import java.util.Scanner;
class PrimeNumber{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n=sc.nextInt();
    int i=2,z=0;
    while(i<=n/2)
      {
        if((n%i)==0)
        {z++;
         break;}       
        i++;
      }
    if(z==0)
    {System.out.println("Your Number is a Prime Number.....:)");}
    else{
      System.out.println("Your number is not a prime number...:(");
    }
    sc.close();
  }
}