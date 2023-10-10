import java.util.Scanner;
public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int start=sc.nextInt();
        int end=sc.nextInt();
        int even[]=new int[start+end];
        int odd[]=new int[start+end];
        int ev=0;
        int od=0;
        for(int i=start;i<=end;i++){
           if(i%2==0){even[ev]=i;
        ev++;}
        else{
           odd[od]=i;
           od++;}
        }
        for(int i:even){
            if(i==0)continue;
            else
            System.out.print(i +" ");}
        System.out.println();
        for(int i:odd){
            if(i==0)continue;
            else
            System.out.print(i +" ");}
        sc.close();
    }
}
