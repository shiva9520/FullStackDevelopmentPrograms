import java.util.Scanner;

public class SeasonDetermine {
    static String seasonChecker(String month){
       switch(month.toLowerCase()){
         case "march":
        case "april":
        case "may":return "spring";
        case "june":
        case "july":
        case "august":return "summer";
        case "september":
        case "october":
        case "november":return "fall";
        case "december":
        case "january":
        case "february":return "winter";
        default:return "Invalid month";
       }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month name:");
        String month=sc.nextLine();
        String res=seasonChecker(month);
        System.out.println("Seaason is "+res);
        sc.close();
    }
}
