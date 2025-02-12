class checkprime
{
    public static void main(String[] args) {
    int count=0,a=9999931;
    if(a==2)
    {
        System.out.println("Enterd number is prime");
    }
    else if(a>2)
       {
        int i=2;
        while(i<a)
        {
           if(a%i==0)
           {
              count++;
              break;
           }
           else
             i++; 
        }
       }
    if(count==0)
       {
        System.out.println("Enterd number is prime");
       }   
    else
       {
        System.out.println("Enterd number is not prime");
       }
}
}