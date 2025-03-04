class ReverseSentence
{
    public void reverse(String a)
    {
        int len=a.length()-1;
        int i=len,j=len+1;
        while(i>=0)
        {
            if(i==0)
            {
                System.out.print(a.substring(0,j));
                i--;
            }
            else if((a.charAt(i)==' ' && a.charAt(i-1)==' ') || (a.charAt(i)!=' ' && a.charAt(i-1)!=' '))
            {
                i--;
            }
            else if(a.charAt(i)==' ' && a.charAt(i-1)!=' ')
            {
                j=i;
                i--;
            }
            else if(a.charAt(i)!=' ' && a.charAt(i-1)==' ')
            {
                System.out.print(a.substring(i,j)+" ");
                i--;
            }
        }
    }
}
class ReverseString 
{
    public static void main (String[] args) {
    ReverseSentence obj=new ReverseSentence();
    String a="  I Love java  Programming";
    obj.reverse(a);
}
}