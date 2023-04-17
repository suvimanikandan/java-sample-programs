import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1=in.nextInt();
        System.out.println("Enter the n2: ");
        int n2=in.nextInt();
        int sum=n1+n2;
        System.out.println("Sum is : " + sum);
    }
}
