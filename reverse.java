class reverse
{
   public static void main(String[] args) {
       int a=35721,b,count=0,res=0;
       while(a>0)
       {
        b=a%10;
        a=a/10;
        count++;
        res=res*10+b;
       }
       System.out.println("\nNumber of digits:"+count);
       System.out.println("Reverse order:"+res);
   }
}
