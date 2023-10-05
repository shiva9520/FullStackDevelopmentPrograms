import java.util.Scanner;

public class WeekdayOrWeekendChecker {
    static String weekendChecker(String day){
        switch(day.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":{
                    return "weekday";
            }
            case "saturday":
            case "sunday":{return "weekend";}
            default:return "Invalid Input";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day name :");
        String day=sc.nextLine();
        String res=weekendChecker(day);
        System.out.println("Your day is "+res);
        sc.close();
    }
}
