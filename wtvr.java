import java.util.*;
class wtvr
{
    public void accept(String str){
        String[] minute={" "," one"," two"," three"," four"," five"," six"," seven"," eight","nine","ten"," eleven"," twelve"," thirteen"," quarter","fifteen"," sixteen"," seventeen"," eighteen"," nineteen","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","half","half"}, hour={" ","one"," two"," three"," four"," five"," six"," seven"," eight","nine","ten"," eleven"," twelve","one"};
        Scanner s=new Scanner(str).useDelimiter(":");
        int h=s.nextInt(), m=s.nextInt();
        try{
            if(m<30) System.out.println(minute[m]+" past "+hour[h]);
            else if(m>=30)  System.out.println(minute[60-m]+" to "+hour[h+1]);
            else if(m==0||m==60)  System.out.println(hour[h]+"o'clock");}
        catch(ArrayIndexOutOfBoundsException a){System.err.println("Invalid");}
    }
}
