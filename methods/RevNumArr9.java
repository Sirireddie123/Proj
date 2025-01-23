public class RevNumArr9
{
    public static void main(String args[])
    {
        int n=3628;
        int a[] ={2,5,4,1};
        reverse(n);
         reverse(a);

    }
    static void reverse(int n)
    {
        int m,rev=0;
        while(n>0)
        {
         m=n%10;
         rev=rev*10+m;
         n=n/10;
        }
        System.out.println("Reverse is:"+rev);
    }
    static void reverse(int a[])
    {
        int i,j;
        int b[]=new int[a.length];
        for( i=a.length-1,j=0;i>=0&&j<a.length;i--,j++)
        {
            b[j]=a[i];
        }
        for(int x:b)
        System.out.println((x));
    }
}
