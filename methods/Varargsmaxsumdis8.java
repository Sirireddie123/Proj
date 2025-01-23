public class Varargsmaxsumdis8 {


    public static void main(String args[]) {
        max(2,3,1,5);
        discount(257.2,578.3,23.4);
    }

    static int max(int... x) {
        int m = x[0];
        int sum = 0;
        if (x.length == 0) return Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];

            if (x[i] > m)
                m = x[i];

        }
        System.out.println("MAX IS:" + m);
        System.out.println("SUM IS:" + sum);
        return 0;
    }
    static double discount(double...p)
    {
        double sum = 0;
        for (int i = 0; i <p.length; i++) {
            sum=sum +p[i];
        }
        System.out.println(sum);
        if(sum<1000) {
            System.out.println("discount is:" +((float)10/100 * sum) );
        }
        if(sum>1000) {
            System.out.println("discount is:" + (0.2 * sum));
        }
        return 0;
    }
}
