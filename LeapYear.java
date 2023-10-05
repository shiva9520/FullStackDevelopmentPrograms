import java.util.Scanner;

public class LeapYear {
    // Write a program that checks if a given year is a leap year.
    // A leap year is divisible by 4, but not divisible by 100 unless it is also
    // divisible by 400.
    static boolean leapYear(int year) {
        if (year % 4 == 0 && year != 100 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year :");
        int year = sc.nextInt();
        if (leapYear(year))
            System.out.println("Your Entered Year is Leap Year");
        else
            System.out.println("Your Entered Year is not Leap Year");
        sc.close();
    }
}
