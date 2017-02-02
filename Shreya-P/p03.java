class p03
{
    int isPrime(int n)
    {  
        for(int i=2;i<n;i++)
        {   if(n%i==0)
            { return 0;}
        }   return 1;          
    }
    int Rot(int n)
    {
        String S=Integer.toString(n);
        int n1= Integer.parseInt(S.substring(1)+S.charAt(0));
        return n1;        
    }
    void input(int n)
    {
        System.out.println(n);
        int l=Integer.toString(n).length(),temp=n,cnt=0;
        for(int i=0;i<l;i++)
        {    if(Rot(temp)!=n)
          { System.out.println(Rot(temp));
            if(isPrime(Rot(temp))==1)
            { cnt++;}
            temp=Rot(temp);}
        }
        if(cnt==l-1)
        {System.out.println("No. is a circular prime");}
        else
        {System.out.println("No.is not circular prime");}
    }
}