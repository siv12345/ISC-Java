class p18
{
    void accept()
    {
        int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
         int r,r1=0,c1=0,c;
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                if(r==c)
                {
                    if(a[r][c]==1)
                    {
                        c1++;
                    }
                }
                else if(r!=c)
                {
                    if(a[r][c]==0)
                    {
                        r1++;
                    }
                }
            }
        }
           if(c1==3 && r1==6)
           {  System.out.println("Identity Matrix");              
            }
            else
            {
            System.out.println("Not Identity Matrix");
        }
        
    }
}
             

