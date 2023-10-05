import java.util.Scanner;

public class VowelOrConstant {
    static String letterChecker(char letter){
        switch(Character.toLowerCase(letter)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':return "vowel";
            default:return "constant";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch=sc.nextLine().charAt(0);
        System.out.println("Your letter is "+(letterChecker(ch)));
        sc.close();
    }
}
