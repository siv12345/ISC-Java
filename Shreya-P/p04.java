import java.util.*;
class p04
{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        int tn,km,total=0;
        System.out.println("Taxi no.");
        tn=sn.nextInt();
        System.out.println("Kilometres travelled");
        km=sn.nextInt();
        
        if(km<=10)
        {
            total=30*km;
        }
        else if(km>10&&km<=30)
        {
            total=30*10+20*(km-10);
        }
        else if(km>30&&km<=70)
        {
            total=30*10+20*20+15*(km-30);
        }
       else if (km>70)
       {
           total=30*10+400+600+(km-70)*12;
        }
        System.out.println("Total fare="+total);
    }
    }
    
        

