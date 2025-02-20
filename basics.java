class basics
{
    public static void main(String s[])
    { 
        //printing hello world
        System.out.println("Hello world");

        //Arithmetic operator
        int a=10;
        int b=2;
        System.out.println("The sum of "+ a + " and "+ b+" is :"+(a+b));
        System.out.println("The difference of "+ a + " and "+ b+" is :"+(a-b));
        System.out.println("The multiplication of "+ a + " and "+ b+" is :"+(a*b));
        System.out.println("The division of "+ a + " and "+ b+" is :"+(a/b));
        System.out.println("The sum of "+ a + " and "+ b+" is :"+(a%b));
       
        //ternary and relational operator
        int c=44;
        int max=(a>b)?a:b;
        System.out.println("Maximum value is "+max);
        int max_1=(a>b && a>c) ? a : (b>c) ? b:c;
        System.out.println("Maximum value is "+max_1);

        //bitwise operator
        int d=492;
        int e=333;
        System.out.println("Bitwise AND operator:"+ (e&d));
        System.out.println("Bitwise OR operator:"+ (e|d));
        System.out.println("Bitwise XOR operator:"+ (e^d));
        System.out.println("Bitwise NOT operator:"+ (~d));

        /*lossy conversion
         int x=28;
         int y=58;
         byte z=x*y;
         System.out.println(z);*/
        //type casting
         int x=28;
         int y=58;
         byte z=(byte)(x*y);
         System.out.println(z);
    } 
}
