class saddle
{
    public static void m()
    {
        //int arr[][] = {{3,42,1},{23,55,11},{7,45,23}};
        int arr[][] = {{4,0,12},{2,1,14},{1,0,8}};
        for(int i=0;i<arr.length;i++) //prints in maxtrix form
        {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        int s = 0;
        for(int i=0;i<arr.length;i++)
        {
            s = arr[i][0]; //taking out first element in the row
            int idx[] = new int[2]; //to store rowid and columnid
            for(int j=0;j<arr.length;j++) //takes out minimum number from row and stores indexes in idx
            {
               if(s>arr[i][j]) 
               {
                   s = arr[i][j];
                   idx[0] = i;
                   idx[1] = j;
                }
            }
            int temp = 0;
            for(int row = 0; row<arr.length;row++) //finds out whether the number is maximum in its column
            {
                if(s < arr[row][idx[1]]) 
                {
                    temp = arr[row][idx[1]];
                }
            }
            if(temp==0)  //found the saddle point
                break;
            else s=0;
        
        }
        if(s!=0)
        System.out.println(s+" is the saddle point");
        else
        {   System.out.println("No saddle point in the above matrix"); }
    }
}