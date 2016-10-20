import java.util.*;
class logs
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        double n=sc.nextDouble();
        double no = n;
        double ans = 0;
        do
        {
            double num = no-1;
            if(num>1)
            {
                ans+= exp((1.0/num));
            }
            else if(num<=1)
            {
                ans+= exp(num);
                break;
            }
            no = num;
        } while(no>=2);
        System.out.println(ans);
    }
    public static double exp(double c)
    {
        double ans = 1;
        for(int i=2;i<=50000;i++)
        {
            double s = (i%2==0)?-1:1;
            double no = Math.pow(c,i-1)/(s*i);
            ans += no;
        }
        return ans;
    }
}