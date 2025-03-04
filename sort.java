class sort 
{
    public static void main(String args[])
    {
        int[][] arr={{5,4,7},{1,8,3},{9,6,2}};
        int r=arr.length,temp;
        int c=arr[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<r;k++)
                {
                    for(int l=0;l<c;l++)
                    {
                        if(i==k && j==l)
                        {
                            continue;
                        }
                        if(arr[i][j]<arr[k][l])
                        {
                            temp=arr[i][j];
                            arr[i][j]=arr[k][l];
                            arr[k][l]=temp;
                        }
                    }
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