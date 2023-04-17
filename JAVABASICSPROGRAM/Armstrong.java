public class Armstrong {
    public static void main(String[] args) {
        int num = 371, orgnum, rem, res = 0;
        orgnum = num;
        while (orgnum != 0) {
            rem = orgnum % 10;
            res += Math.pow(rem, 3);
            orgnum = orgnum / 10;


        }
        if (res == num) {
            System.out.println("armstrong num");
        } else {
            System.out.println("not armstrong");
        }
    }
}