import java.util.*;
public class gcd4
{
    public static void main (String args[])
    {
        int x,y;
        System.out.println("enter x,y:");
        Scanner sc=new Scanner(System.in);
        x= sc.nextInt();;
        y=sc.nextInt();
        gcd(x,y);
    }
    static void gcd(int a,int b)
{
    while(a!=b)
    {
        if(a>b)
            a=a-b;
        else if (b>a)
            b=b-a;

    }
    System.out.println("gcd is"+a);
}
}
