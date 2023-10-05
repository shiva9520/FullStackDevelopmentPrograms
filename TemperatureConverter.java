import java.util.Scanner;
public class TemperatureConverter {
    static float celToFeh(float temp){
        float res=(temp*9/5)+32;
        return res;
    }
    static float fehToCel(float temp){
        float res=5/9*(temp-32);
        return res;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Welcome---");
        System.out.println("Choose your option..");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        System.out.println("Enter your choice :");
        int choice=sc.nextInt();
        System.out.println("Enter the Temperature :");
        float temp=sc.nextFloat();
        float res=0;
        switch(choice){
            case 1:res=celToFeh(temp);
                break;
            case 2:res=fehToCel(temp);
                break;
            default:System.out.println("Wrong Choice..");
        }
        System.out.println("Your converted Temperature is :"+res);
        sc.close();
        
    }
}
