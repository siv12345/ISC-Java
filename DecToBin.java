//Convert a Decimal number into a Binary value
class DecToBin
{
    public void accept(int i)
    {
        int remainder;
        String str="";
        while(i!=0)
        {
            remainder=i%2;
            i=i/2;
            str=remainder+str;
        }
        System.out.println(str);
    }
}