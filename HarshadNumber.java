import java.util.Scanner;
class HarshadNumber
{
    public static int Sum(int a)
    {
        int sum=0;
        while(a>0)
        {
            sum=sum+(a%10);
            a=a/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit:
        
        ");
        int a=in.nextInt();
        int b=in.nextInt();
        for(int i=a;i<=b;i++)
        {
            int divident=i;
            int divisor=Sum(i);
            if((divident%divisor)==0)
            {
                System.out.println(i);
            }
        }
    }
}