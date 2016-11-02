import java.util.*;
class p241
{ 
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the date");
        int d1=sn.nextInt();
        String d,m,y,add;
        int da,mo,ye,cnt=0;
        String month[]={" ","January","February","March","April","May","June","July","August","September","October","November","December"};
        String date=Integer.toString(d1);
        d=date.substring(0,2); 
        da=Integer.parseInt(d);
        m=date.substring(2,4);
        mo=Integer.parseInt(m);
        y=date.substring(4);
        ye=Integer.parseInt(y);
        if(mo==1||mo==3||mo==5||mo==8||mo==10||mo==12||mo==7&& da<=31)
        {   cnt++;  }
        else if(mo==4||mo==6||mo==9||mo==11&&da<=30)
        {  cnt++; }
        else if(mo==2&&da<=28)
        {  cnt++; }
        else if(ye%4==0&&da==29&&mo==2)
        {   cnt++; }
        if(cnt==1)
        { if(da==3||da==23)
            {  add="rd";}
           else if(da==2||da==22)
            {  add="nd";}
           else if(da==1||da==21)
           {  add="st";}
           else 
           {  add="th";}
           System.out.println(da+add+" "+month[mo]+" "+ye);
        }
        else if(cnt!=1)
        {  System.out.println("Invalid Date"); }
    }
}