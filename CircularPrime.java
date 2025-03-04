import java.util.Scanner;
class CircularPrime 
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
            int temp=10,temp1=a,temp2,temp3,temp4=1,d=0;
            int q=a,j=0;
            while(q>0)
            {
               if(q>9)
               {
                   temp4*=10;
               }
               q=q/10;
               d++;
            }
            for(int i=1;i<d;i++)
            {
                temp2=temp1/temp;
                temp3=temp1%temp;
                temp1=(temp3*temp4)+temp2;
                if(isPrime(temp1))
                {
                    j++;
                }
                else
                {
                    System.out.println("Not a circular prime number");
                    break;
                }
        }
            if(j==d-1)
            {
                System.out.println("circular prime number");
            }
        }
        else
        {
            System.out.println("Not a circular prime number");
        }
    }
}