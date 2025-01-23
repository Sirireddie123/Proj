public class Validate10
{
    public static void main(String args[])
    {
        System.out.println(validate("siri"));
        int age=19;
        System.out.println(validate(age));
    }
    static boolean validate(String s)
    {
        return s.matches("[a-zA-Z//S]+");
    }
    static boolean validate(int age)
    {
        return age>5&&age<12;
    }
}
