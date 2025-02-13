

class nestedloop
{
    public static void main(String s[])
    {   
        int n=5;
        int i,j,count=0;
        //print 1-j values
        System.out.println("Numbers in triangle:");
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=i;j++)
           { 
            System.out.print(" "+j);
           }
            System.out.println();
        }
        //print 1 in right angle
        System.out.println("Numbers in Right-angle triangle:");
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=n-i;j++)
           {
            System.out.print("  ");
           }
           for(j=n-i+1;j<=n;j++)
           {
            System.out.print(" 1");
           }
          System.out.println();
        }

        //print number in increasing order
        System.out.println("Natural Numbers in triangle:");
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=i;j++)
           { 
            count++;
            System.out.print(" "+count);
           }
            System.out.println(); 
        }

        //print 1 in triangle shape 
        System.out.println("Numbers in Equilateral triangle:");      
       for(i=1;i<=n;i++)
       {
          for(j=1;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(int k=1;k<=(2*i-1);k++)
           {
            System.out.print("1");
           }
          System.out.println();
       }

       //print number in triangle
       System.out.println("Number pattern:");
       for(i=1;i<=n;i++)
       {
          for(j=1;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
            System.out.print(k);
           }
           for(int g=i-1;g>0;g--)
           {
            System.out.print(g);
           }
          System.out.println();
       }

       //print hollow triangle
       System.out.println("Hollow triangle filled with zeros:");
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
          if(k==1 || k==(2*i-1) || i==n)
          {
            System.out.print("*");
          }
          else{
            System.out.print(0);
          }
        }
        System.out.println();
       }

     //print numbers diamond shape
     System.out.println("Numbers in diamond shape:");
       for(i=1;i<=n;i++)
       {
          for(j=1;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
            System.out.print(k);
           }
           for(int g=i-1;g>0;g--)
           {
            System.out.print(g);
           }
          System.out.println();
       }
      for(i=n-1;i>0;i--)
       {
          for(j=1;j<=n-i;j++)
           {
            System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
            System.out.print(k);
           }
           for(int g=i-1;g>0;g--)
           {
            System.out.print(g);
           }
          System.out.println();
       }
     
     //print star in diamond shape
     System.out.println("Stars in diamond shape:");
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            if(k%2==0)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
     }
     for(i=n-1;i>0;i--)
     {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            if(k%2==0)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
     }
     
       //print in given format
       System.out.println("Hollow diamond:");
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            if(k==1 || k==(2*i-1))
            {
                System.out.print("*");
            }else if(k%2==0)
            {
                System.out.print(" ");
            }else 
            {
                System.out.print(0);
            }
        }
        System.out.println();
     }
     for(i=n-1;i>0;i--)
     {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++)
        {
            if(k==1 || k==(2*i-1))
            {
                System.out.print("*");
            }
            else if(k%2==0)
            {
                System.out.print(" ");
            }
            else{
                System.out.print(0);
            }
        }
        System.out.println();
     }

     //print x men
     System.out.println("X-Men:");
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=n;j++)
        {
            if(j==i||i+j==n+1)
            {
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }System.out.println();
     }
        }
    }
