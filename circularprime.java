import java.util.*;
class circularprime
{
    public static void m()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int no = n;
        String s = no+"";
        System.out.println();
        
        int c=0;
        while(true)
        {   
            
            if(IsPrime(s))
            {
                System.out.println(s+" is prime");
                s = s.charAt(s.length()-1)+""+s.substring(0,s.length()-1);
                if(s.equals(n+"") && c>0)
                {
                    System.out.println(n+" is circular prime");
                    return;
                }
                c++;
                continue;
            }
            else
            {
                System.out.println(s+" is not prime");
                System.out.println(n+" is not circular prime");
                return;
            }
        }
    }
    public static boolean IsPrime(String s)
    {
        int n = Integer.parseInt(s);
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {   c++;    }
        }
        return (c<=2) ? true : false;
    }
}