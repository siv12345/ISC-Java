//Convert Hexadecimal value into a Decimal Value [Without using Integer.parseInt(String s,int radix)]
class HexToDec
{
    public void accept(String str)
    {
        String str1="";
        int sum=0;
        int a;
        for(int n=0;n<str.length();n++)
        {
            if((int)str.charAt(n)<=57&&(int)str.charAt(n)>=48)
            {
                str1+=str.charAt(n);
                sum+=Integer.parseInt(str1)*Math.pow(16,str.length()-(n+1));
                str1="";
            }
            else
            {
                a=(int)(str.charAt(n))-55;
                sum+=a*Math.pow(16,str.length()-n-1);
            }
        }
        System.out.println(sum);
    }
}
