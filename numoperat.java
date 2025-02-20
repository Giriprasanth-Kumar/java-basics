class numoperat
{
    public static void main(String[] args) {
        int a=123456,res,ee=0,oo=0,pp=0;
        int even = 0,odd = 0,prime =0;
        while(a>0)
        {
            res=a%10;
            a=a/10;
            if(res%2==0)
            {
                even+=res;
                ee=ee*10+res;
            }
            else
            {
                odd+=res;
                oo=oo*10+res;
            }
            if(res==2)
            {
                prime+=res;
                pp=pp*10+res;
            }
            else if(res>2)
            {
               int count=0; 
               for(int i=2;i<res;i++)
               {
                if(res%i==0 && count<1)
                {
                    count++;
                }   
               }
               if(count<1)
               {
                  prime+=res;
                  pp=pp*10+res;
               }
            }
        }
        System.out.println("The sum of even numbers:"+even);
        System.out.println("The sum of odd numbers:"+odd);
        System.out.println("The sum of prime numbers:"+prime);
        System.out.println("Even numbers in reverse order:"+ee);
        System.out.println("Odd numbers in reverse order:"+oo);
        System.out.println("Prime numbers in reverse order:"+pp);
    }
}
