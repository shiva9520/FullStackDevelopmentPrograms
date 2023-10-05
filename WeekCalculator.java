import java.util.Scanner;
public class WeekCalculator {
    static String weekCalculator(int day){
        if(day==1)return "Sunday";
        else if(day==2)return "Monday";
        else if(day==3)return "Tuesday";
        else if(day==4)return "Wednesday";
        else if(day==5)return "Thursday";
        else if(day==6)return "Friday";
        else if(day==7)return "Saturday";
        else return "Invalid Entered";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int day=sc.nextInt();
        System.out.println("Day is "+weekCalculator(day));
        sc.close();
    }
}
