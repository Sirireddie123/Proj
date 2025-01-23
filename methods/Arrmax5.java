public class Arrmax5
{
    public static void main(String args[])
    {
        int a[]={1,2,13,4};
        max(a);
    }
  static void max(int arr[])
{
    int max=arr[0];
    for(int i=0;i<arr.length;i++)
        if(arr[i]>max){
            max=arr[i];
        }
    System.out.println("max element is:"+max);

}
}
