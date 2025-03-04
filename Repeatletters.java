import java.util.Scanner;
class Repeat
{
    public void rep(String a)
    {
        int len=a.length(),num=0;
        String letter="";
        
        for(int i=0;i<len;i++)
        {
            if(Character.isAlphabetic(a.charAt(i)))
            {
                letter=letter+a.charAt(i);
            }
            else if(Character.isDigit(a.charAt(i)))
            {
                int n=a.charAt(i)-'0';
                num=(num*10)+n;
            }
            if(i==len-1)
            {
                for(int j=0;j<num;j++)
                {
                System.out.print(letter);
                }
                if(num==0)
                {
                    System.out.println(letter);
                    
                }
            }
            else if((Character.isAlphabetic(a.charAt(i+1))) && (num!=0))
                {
                    for(int j=0;j<num;j++)
                    {
                    System.out.print(letter);
                    }
                    letter="";
                    num=0;
                }
        }
    }
}
class Repeatletters
{
    public static void main (String[] args) {
        Repeat obj=new Repeat();
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        obj.rep(a);
    }
}