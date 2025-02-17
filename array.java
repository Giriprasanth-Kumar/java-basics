class array
{
    public static void main(String[] args) {
    int num[]={3,2,6,4,5};

        //printing array using for-each loop
        System.out.println("array using for-each loop");
        for(int i:num)
        {
            i++;
            System.out.println(i);
        }
        
        //printing array using for loop
        System.out.println("array using for loop");   
        for(int i=0;i<num.length;i++)
        { 
            System.out.println(num[i]);
        }
        
        //printing array in reverse using for loop
        System.out.println("array in reverse order");  
        for(int i=num.length-1;i>=0;i--)
        {
             System.out.println(num[i]);
        } 

        //finding max in array using condition statement
        System.out.println("Max values in array");
        int max1=num[0],max2=num[0];
        for (int i = 1; i < num.length; i++)
        {
          if(num[i]>max1)
          {
            max1=num[i];
          }  
        }
        System.out.println(max1);
        for (int i = 1; i < num.length; i++)
        {
          if(num[i]>max2 && num[i]<max1)
          {
            max2=num[i];
          }  
        }
        System.out.println(max2);

        //printing max values after sorting
        int temp;
        for(int i=0;i<num.length;i++)
        {
            for(int j=i+1;j<num.length;j++)
            if(num[i]>num[j])
            {
                temp=num[j];
                num[j]=num[i];
                num[i]=temp;
            }
        }
        System.out.println("Maximum value in array is:"+num[num.length-1]);
        System.out.println("Second Maximum value in array is:"+num[num.length-2]);
        System.out.println("Third value in array is:"+num[num.length-3]);    

        //finding max consecutive 1's
        int arr[]={1,1,0,0,1,1,0,0,1,0,1,1,1,0};
        int count=0,previous=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
            {
                count++;
            }
            else
            {
                if(previous<count)
                {
                previous=count;
                count=0;
                }
                else
                   count=0;
            }
        }
        System.out.println("max number of consecutive one:"+previous);
       
        //pushing all zeros to last place
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                temp=arr[i];
                int j=i+1;
                while(j<arr.length)
                {
                    if(arr[j]!=0)
                    {
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                    else
                       j++;
                }
            }
        }
        for(int i:arr)
        {
            System.out.print(i);
        }
    }
}