import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        int fn=in.nextInt();
        int sn=in.nextInt();
        while(fn>0){
            int rem=fn%10;
            if(rem==sn){
                count++;
            }
            fn=fn/10;
        }
        System.out.println(count);
    }
}
