import java.util.*;
public class p25
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int i,sum=0,l,j;
        long n,a,cnt=0;
        String no;
        System.out.println("Input your IMIE number");
        n=sn.nextLong();
        no=Long.toString(n);
        l=no.length();
        if(l>=16)
        {  System.out.println("Invalid IMEI no.");  }
        else if(l==14)
        {
          for(i=0;i<l;i++)
            {
                if(i%2==0)
            
                {   sum=sum+(2*no.charAt(i));  }
                else 
                {  sum=sum+(no.charAt(i));  }
            }
        }
        if(sum%10==0)
        {  System.out.println("Valid no.");   }
        else
        {  System.out.println("Invalid IMEI no."); }
    }
}
    //temp=no.charAt(i)
    //temp=2*temp;
    

