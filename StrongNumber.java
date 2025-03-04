import java.util.Scanner;
class StrongNumber
{
    static int res;
    public static int fact(int a)
    {
        if(a==0 || a==1)
        {
            return 1;
        }
        if(a>1)
        {
            res=a*fact(a-1);
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        for(int i=1;i<=a;i++)
        {
        int fin=0,q=i;
        while(q>0)
        {
            int res=q%10;
            q=q/10;
            fin=fin+fact(res);
        }
        if(i==fin)
        {
        System.out.println(i);
        }
        }
    }
}