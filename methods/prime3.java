import java.util.*;
public class prime3 {
    public static void main(String args[]) {
        int n;
        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime(n);
    }

    static void prime(int a) {
           int count=0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0)
                count++;
        }
        if(count==0)
                System.out.println("number is prime");
            else
                System.out.println("number is not prime");

    }
}
