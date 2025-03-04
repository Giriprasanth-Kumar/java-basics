class SymmetricMatrix
{
    public static void main(String args[])
    {
        int[][] arr={{5,4,7},{1,8,3},{9,6,2}};
        int r=arr.length,temp;
        int c=arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                if(i>j)
                {
                    arr[i][j]=arr[j][i];
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