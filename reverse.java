import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reverse=0;
        while(n!=0){
            int l=n%10;
            reverse = (reverse*10)+l;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
 