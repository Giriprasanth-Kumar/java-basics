import java.util.Scanner;
class Arrreverse
{
    public static void main(String[] abcd)
    {
       Scanner a=new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int r=a.nextInt();
        System.out.println("Enter number of Columns:");
        int c=a.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("enter element in row "+(i+1)+" and column "+(j+1));
                arr[i][j]=a.nextInt();
            }
        }
        System.out.println("the matrix is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        } 
        int rem;
        if(r%2==0)
        {
           rem=r/2;
        }
        else{
            rem=(r/2)+1;
        }
        for(int i=0;i<rem;i++)
        {   
            for(int j=0;j<c;j++)
            {
                if(r%2!=0)
                {
                if(i==r/2 && j>=(c/2))
                {
                    break;
                }
                else
                {
                int temp=arr[i][j];
                arr[i][j]=arr[r-i-1][c-j-1];
                arr[r-i-1][c-j-1]=temp;
                }
                }
                else
                {
                int temp=arr[i][j];
                arr[i][j]=arr[r-i-1][c-j-1];
                arr[r-i-1][c-j-1]=temp;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}