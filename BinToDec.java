//Convert a Binary Number into a Decimal Number
class BinToDec
{
    public void accept(int i)
    {
        String str=Integer.toString(i);
        String str1="";
        int sum=0;
        for(int n=0;n<str.length();i++)
        {
          str1=str1+str.charAt(n);
          sum+=Integer.parseInt(str1)*Math.pow(2,str.length()-(n+1));
          str1="";
        }
        System.out.println(sum);
    }
}