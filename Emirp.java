import java.util.*;
class Emirp
{
    int n, rev, f;
    Emirp(int nn)
    {
        n=nn;
        rev=0;
        f=2;
    }
     
    
    int isprime(int x)
    {
        if(x<=n) 
        {
            if(n%x!=0)
            {
                isprime(x+1);
            }
        } 
        if(x==n)
            return 1;
        else
            return 0;
    }
      
    void isEmirp()
    {
         int copy=n, d;
         while(copy>0) 
         {
             d=copy%10;
             rev=rev*10+d;
             copy=copy/10;
         }
      
         int a=isprime(f); 
         n = rev; 
         f=2; 
         int b=isprime(f); 
      
         if(a==1 && b==1) 
         System.out.println("It is an Emirp Number");
         else
         System.out.println("It is Not an Emirp Number");
    }
      
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n=sc.nextInt();
        Emirp ob=new Emirp(n);
        ob.isEmirp();
    }   
}