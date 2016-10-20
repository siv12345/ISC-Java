import java.util.*;
class m2
{
        public static void s()
        {
            int a[][]={{3,2,1},{6,2,8},{5,2,5}};
            int sp=0,ss=0;
            
            for(int i=0;i<a.length;i++)
        { 
            for(int j=0;j<a.length;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
            for(int i=0;i<a.length;i++)
            {
                sp = sp+a[i][i];
            }
            System.out.println("Sum of primary diagonal is: "+sp);
            int t=a.length-1;
            for(int i=0;i<a.length;i++)
            {
                ss  = ss + a[i][t];
                t--;
            }
            System.out.println("Sum of secondary diagonal is: "+ss);
        }
}