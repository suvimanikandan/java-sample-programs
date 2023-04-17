import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter number: ");
        int n=in.nextInt();
        if(n<=1){
            System.out.println("neither prime nor composite");
            return;
        }
        int c=2;
        if(n==4){
            System.out.println("not prime");
        }
        else{
            while(c*c<n){
                if(c%n==0){
                    System.out.println("not prime");
                    return;
                }
                c=c+1;

            }
            if(c*c>n){
                System.out.println("prime");
            }
        }
    }
}
