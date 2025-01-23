import java.util.*;

public class Moverloading6
{
    public static void main(String args[]) {
        System.out.println(max(2.3,4.1));
    }
    static int max(int x,int y)
    {
        return x>y?x:y;
    }
    static double max(double x,double y)
    {
        return x>y?x:y;
    }
}
