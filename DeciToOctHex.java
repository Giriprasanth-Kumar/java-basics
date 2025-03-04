import java.util.Scanner;
class DeciToOctHex
{
    public static int num=0;
    public static String res="";
    public static int oct(int q)
        {
        int quo;
        while(q>=8)
        {
            quo=q/8;
            if(quo<8)
            {
            octal(quo);
            }
            else{
                oct(quo);
            }
            q=q%8;
        }
        octal(q);
        return num;
        }
        public static String hex(int q)
        {
        int quo;
        while(q>=16)
        {
            quo=q/16;
            if(quo<16)
            {
            hexal(quo);
            }
            else{
                hex(quo);
            }
            q=q%16;
        }
        hexal(q);
        return res;
        }
        public static void hexal(int q)
        {
            switch(q)
            {
            case 0:
                res=res+"0";
                break;
            case 1:
                res=res+"1";
                break;
            case 2:
                res=res+"2";
                break;
            case 3:
                res=res+"3";
                break;
            case 4:
                res=res+"4";
                break;
            case 5:
                res=res+"5";
                break;
            case 6:
                res=res+"6";
                break;
            case 7:
                res=res+"7";
                break;
            case 8:
                res=res+"8";
                break;
            case 9:
                res=res+"9";
                break;
            case 10:
                res=res+"A";
                break;
            case 11:
                res=res+"B";
                break;
            case 12:
                res=res+"C";
                break;
            case 13:
                res=res+"D";
                break;
            case 14:
                res=res+"E";
                break;
            case 15:
                res=res+"F";
                break;
            }
        }
    public static void octal(int q)
        {
            switch(q)
            {
            case 0:
                num=num*10+0;
                break;
            case 1:
                num=num*10+1;
                break;
            case 2:
                num=num*10+2;
                break;
            case 3:
                num=num*10+3;
                break;
            case 4:
                num=num*10+4;
                break;
            case 5:
                num=num*10+5;
                break;
            case 6:
                num=num*10+6;
                break;
            case 7:
                num=num*10+7;
                break;
            }
        }
    public static void main(String args[])
    {
        
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int res1=oct(a);
        System.out.println(res1);
        String res2=hex(a);
        System.out.println(res2);  
    }
}