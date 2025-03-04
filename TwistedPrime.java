import java.util.Scanner;
class TwistedPrime 
{
    public static boolean isPrime(int a)
    {
        if(a==2)
        {
            return true;
        }
        else
        {
            for(int i=2;i<a;i++)
            {
                if(a%i==0)
                {
                    return false;
                }
            }
        }return true;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(isPrime(a))
        {
            int res=0;
            int q=a;
            while(q>0)
            {
                res=(q%10)+(res*10);
                q/=10;
            }
            if(isPrime(res))
            {
                System.out.println("Twisted Prime Number");
            }
            else{
                System.out.println("Not a Twisted Prime Number");
            }
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }
}
            