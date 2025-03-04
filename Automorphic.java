class Automorphic{
    public static void main (String[] args)
    {
    for(int i=0;i<=10000;i++)
    {
    long a=i;
    long res=a*a;
    long rem1,rem2;
    long count=0;
    while(a>0)
    {
        rem1=a%10;
        rem2=res%10;
        if(rem1!=rem2)
        {
            count++;
            break;
        }
        else
        {
            res=res/10;
            a=a/10;
        }
    }
    if(count==0)
    {
        System.out.println(i);
    }
    }
}
}