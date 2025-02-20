import java.util.Scanner;
class Arrsort
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter number of Rows:");
        int row=a.nextInt();
        System.out.println("Enter number of Columns");
        int col=a.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.println("enter element in row "+(i+1)+" and column "+(j+1));
                arr[i][j]=a.nextInt();
            }
        }
        System.out.println("the matrix is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int temp;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               for(int k=i;k<row;k++)
               {
                if(k==i)
                {
                    for(int f=j;f<col;f++) 
                {
                   if(arr[i][j]>arr[k][f]) 
                   {
                    temp=arr[i][j];
                    arr[i][j]=arr[k][f];
                    arr[k][f]=temp;
                   }
                }
                }
                else
                {
                for(int f=0;f<col;f++) 
                {
                   if(arr[i][j]>arr[k][f]) 
                   {
                    temp=arr[i][j];
                    arr[i][j]=arr[k][f];
                    arr[k][f]=temp;
                   }
                }
                }
               }
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}