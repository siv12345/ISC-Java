class p13
{
   public static void main(String args[])
   {
       int i,r,sum=0,temp,temp1;
       for(i=1;i<=100;i++)
       
       {   temp1=i;
         while(temp1>=10)
         {  sum=0;
           while(temp1>0)
           {
               r=temp1%10;
               sum=sum+r;
               temp1=temp1/10;
            }
            temp1=sum;
          }
          
            if(sum == 1 || i==1)
            {
                System.out.println(i+"is a Magic Number");
            }
            
       }
    }
}
        
           
            
       
    

