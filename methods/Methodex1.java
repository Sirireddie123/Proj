public class Methodex1
{
   static int max(int a,int b)
    {
        a++;
        b++;
        System.out.println(a);
        if(a>b)
            return a;
        else
            return b;

    }
    public static void main(String args[])
    {
     int a=10,b=9;
     int c=max(a,b);
     System.out.println(a);
        System.out.println(c);
    }
}
