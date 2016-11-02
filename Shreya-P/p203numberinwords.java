
import java.util.*;
class p203numberinwords
{
    public static void main (String args[])
    {
        Scanner S=new Scanner (System.in);
        int n,p,i=0,r,r1=0,l,nc=0,ntl=0,nl=0,ntt=0,nt=0,nh=0,n1=0,q=0,un=0,q1=0,q2=0;
        System.out.println("Enter the number");
        n=S.nextInt();
        String no;
        String s2[]={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String s1[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
                
        no=Integer.toString(n);
        l=no.length();
        String s[]=new String[91];
        if(n<=19)
        {
             System.out.print(s1[n]+" ");
             
        }
        else if(n>19)
        {
            nc=n/10000000;
            n=n-(nc*10000000);
            ntl=n/1000000;
            n=n-(ntl*1000000);
            nl=n/100000;
            n=n-(nl*100000);
            ntt=n/10000;
            n=n-(ntt*10000);
            nt=n/1000;
            n=n-(nt*1000);
            nh=n/100;
            n=n-(nh*100);
            n1=n/10;
            un=n%10;
          
        }
        if(nc>0)
        {
         System.out.print(s1[nc]+"  crore  " );
        }
        if(ntl>1)
        {
            System.out.print(s2[ntl]+"  ");
        }
        else if(ntl==1)
        {
            System.out.print(s1[(ntl*10)+nl] + " lakh ");
            q1++;
        }
        if(nl>0 && q1!=1)
        {
            System.out.print(s1[nl]+ "  lakh  ");
        }
        if(ntt>0)
        {
            System.out.print(s2[ntt]+"  ");
        }
        else if(ntt==1)
        {
            System.out.print(s1[(ntt*10)+nt] + " thousand ");
            q2++;
        }
        if(nt>0 && q2!=1)
        {
            System.out.print(s1[nt]+ "  thousand  ");
        }
        if(nh>0)
        {
            System.out.print(s1[nh]+ "  hundred  ");
        }
        if(n1>1)
        {
            System.out.print(" and "+s2[n1]+" ");
        }
        else if(n1==1)
        {
            System.out.print(" and "+s1[(n1*10) + un]);
            q=1;
        }
        if(n1!=0 && q!=1)
        {
            System.out.print(s1[un]);
        }
    }
}

