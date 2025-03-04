import java.util.Scanner;
class check
{
    public static boolean pronic(int a)
    {
        for(int i=1;i<a-2;i++)
        {
            int j=i+1;
            if((i*j)==a)
            {
                return true;
            }
        }
        return false;
    }
    public static boolean Abundant(int a)
    {
        int res=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
              res+=i;  
            }
        }
        if(res>a)
        {
            return true;
        }
    return false;
    }
    public static boolean Niven(int a)
    {
        int sum=0;
        int d=a;
        while(d>0)
        {
            sum=sum+(d%10);
            d=d/10;
        }
        if((a%sum)==0)
        {
            return true;
        }
    return false;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int input=in.nextInt();
        int p=0,a=0,n=0;
        if(pronic(input))
        {
           p++;
        }
        if(Abundant(input))
        {
            a++;
        }
        if(Niven(input))
        {
            n++;
        }
        if(a==1 && p==1 && n==1)
        {
            System.out.println("The given number is Pronic,Abundant and Niven number");
        }
        else if(a==0)
        {
            if(p==1 && n==1)
            {
                System.out.println("The given number is Pronic and Niven number");
            }
            else if(p==1)
            {
                System.out.println("The given number is Pronic number");
            }
            else if(n==1)
            {
                System.out.println("The given number is Niven number");
            }
            else
            {
                System.out.println("The given number is neither Pronic,Abundant and Niven number");
            }
        }
        else
        {
            if(a==1 && n==1)
            {
                System.out.println("The given number is Abundant and Niven number");
            }
            else if(a==1)
            {
                System.out.println("The given number is Abundant number");
            }
        }
    }
}