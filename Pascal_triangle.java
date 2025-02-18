class Pascal_triangle
{
	public static void main(String[] args) {
		int n=5;
		System.out.println("Pascal Triangle : ");
		for(int i=1;i<=n;i++)
		{
		    for(int j=n-i;j>=1;j--)
		    {
		        System.out.print(" ");   
		    }
		    int c=1;
		    for(int k=1;k<=i;k++)
		    {
		        System.out.print(c+" ");
		        c = c * (i - k) / k;
		    }
		    System.out.println();
		}
		System.out.println();
		
		
		int m=4;
		System.out.println("Pascal Triangle elements at row " + m + " :" );
		for(int i=m;i<=m;i++)
		{
		    int c=1;
		    for(int k=1;k<=i;k++)
		    {
		        System.out.print(c+" ");
		        c = c * (i - k) / k;
		    }
		    System.out.println();
		}
		
	}
}