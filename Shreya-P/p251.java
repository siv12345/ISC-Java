import java.util.*;
class p251
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        long n,rem,i=0,sum=0,temp=0,sum1=0;
        System.out.println("Enter your IMEI  no.");
        n=sn.nextLong();
        while(n>0)
        {
            rem=n%10;
            i++;
            if(i%2==0)
            {
                sum=2*rem;
                temp=temp+sum%10;
                temp=temp+sum/10;
                sum1=sum1+temp;
                temp=0;
            }
            else 
            {
                sum1=sum1+rem;
            }
            n=n/10;
        }
        if(i==15&&sum1%10==0)
        {
            System.out.println("Valid No.");
        }
        else 
        System.out.println("Invalid no.");
    }
}

        
                