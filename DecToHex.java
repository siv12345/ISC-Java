//Convert a Decimal Value into a Hexadecimal value [Without using Integer.parseInt(String s,int radix)]
class DecToHex
{
    public void accept(int a)
    {
        int r=0;
        String s="";
        while(a!=0)
        {
            r=a%16;
            a=a/16;
            if(r<=9)
            s=r+s;
            else
            s=(char)(r+55)+s;
        }
        System.out.println(s);
    }
}
