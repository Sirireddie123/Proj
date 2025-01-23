import java.lang.*;
public class Methodarr2
{

    public static void main (String args[])
    {
        System.out.println("program to pass object parameters");
        int[] a ={1,2,3,4};
        method(a);
        for(int x:a)
            System.out.println(x);
    }
    static void  method(int arr[])
    {
        arr[2]=6;

    }
}
//if objects are passed in parameters changes will also effect in actual parameters also because no new objects are created
//in case of primitive data types changes in formal parameters wii not effect in actual parameters both are differemt