import java.util.Scanner;
class Palindrome {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Your Number:");
    int num=sc.nextInt();
    int num_2=num;
    int dupli=num_2;
    int rem,rev=0;
    int count=0;
    while(num>0)
      {
        count++;
        num/=10;  
      }
    for (int i=0;i<count;i++)
      {
        rem=num_2%10;
        rev=rev*10+rem;
        num_2=num_2/10;  
      }
    if(rev == dupli)
          {
            System.out.println("Your Number "+dupli+" is Palindrome");
          }
    else{
      System.out.println("Your Number is not Palindrome");
    }
    sc.close();
  }
}