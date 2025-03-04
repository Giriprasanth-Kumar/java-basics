import java.util.Scanner;
class Palindrome
{
    public boolean Str(String a)
    {
        String b="";
        int len=a.length()-1;
        while(len>=0)
        {
            b=b+a.charAt(len);
            len--;
        }
        if(a.equals(b))
        {
            return true;
        }
        return false;
    }
    public boolean Strbuf(StringBuffer a)
    {
        StringBuffer b=new StringBuffer(a);
        b.reverse();
        int n=a.length()-1;
        while(n>=0)
        {
            if(a.charAt(n)==b.charAt(n))
            {
               n--; 
            }
            else
            {
               return false;
            }
        }return true;
    }
    public boolean Strbuild(StringBuilder a)
    {
        StringBuilder b=new StringBuilder(a);
        b.reverse();
        if(a.toString().equals(b.toString()))
        {
            return true;
        }
        return false;
    }
}
class Main 
{
    public static void main (String[] args) {
    Palindrome obj=new Palindrome();
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder strbuild=new StringBuilder(str);
    StringBuffer strbuffer=new StringBuffer(str);
    if(obj.Str(str))
    {
        System.out.println("Palindrome");
    }
    if(obj.Strbuild(strbuild))
    {
       System.out.println("Palindrome");
    }
    if(obj.Strbuf(strbuffer))
    {
        System.out.println("Palindrome");
    }
}
}