import java.util.*;
class haha
{
    public  static boolean IsNumber(int n,int num)
    {   
        int sum = 0;
        String s = Integer.toString(n);
        if(s.length()==1) { sum = n; }
        while(s.length()>1)
        {  

            for(int i=0;i<s.length();i++)
            {   
                int a =  Integer.parseInt(Character.toString(s.charAt(i)));
                sum = sum + a;
            }
            if(Integer.toString(sum).length()<=Integer.toString(num).length()) 
            {   
                break;
            }
            s  = Integer.toString(sum);
            sum = 0;
        }
        if(sum==num){  return true; }
        return false;
    }
    public static void m()
    {
        Scanner sc = new Scanner(System.in); int m,n;
       
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        while(m!=0) {
        if(m<100 || m>10000 || m<n)
        {
            System.out.println("Invalid inputs"); 
        }
        else
        {
            for(int i=m+1;i<=10000;i++)
            {
                if(IsNumber(i,n)==true)
                {
                    System.out.println("Required no.: "+i);
                    System.out.println("Number of digits in required no.: "+Integer.toString(i).length());
                    break;
                }
            }
        } 
        System.out.println("Enter m and n");
        m = sc.nextInt();
        n = sc.nextInt();
        }
    }
}