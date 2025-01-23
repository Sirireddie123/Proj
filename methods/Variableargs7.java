public class Variableargs7
{
    static void show(int ...x)
    {
        for(int a:x)
            System.out.println(a);
    }
    static void show(String ...s)
    {
        for(int i=0;i<s.length;i++)
        {
            System.out.println((i+1)+"."+s[i]);
        }

    }
    public static void main(String args[])
    {
        show(1,2,3);
        show(new int[]{3,4,5});
        show("hey","siri");
    }
}
