import java.util.*;
class p30
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int a[][]=new int[3][3];
        int r,c,large=a[0][0],seclarge=a[0][0];
        for(r=0;r<3;r++)
        {  for(c=0;c<3;c++)
            {   System.out.println("enter a no.");
                a[r][c]=sn.nextInt();
            }
        }     
       for(r=0;r<3;r++)
       {   for(c=0;c<3;c++)
           {   if(large<a[r][c])
               { large= a[r][c];
               }
            }
       }
       for(r=0;r<3;r++)
       {   for(c=0;c<3;c++)
           {   if(large>a[r][c]&&a[r][c]>seclarge)
               { seclarge=a[r][c]; }
            }
       }
       System.out.println("Second largest="+seclarge);
    }
}
                   
               
                   