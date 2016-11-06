//Converts numbers into words (Until 1 crore)
class NumberToWords
{
    public void accept(int n)
    {
        String one[]={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String tens[]={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String ties[]={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String suffixes[]={"crore","","lakh","","thousand","hundred","",""};
        String str=Integer.toString(n);
        while(str.length()!=8)
        str='0'+str;
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int b=Character.getNumericValue(a[i]);
            if (b==0)
            System.out.print("");
            else
            {
                if(i!=1&&i!=3&&i!=6)
                System.out.print(" "+one[b]+suffixes[i]+" ");
                else
                {
                    if(b==1)
                    System.out.print(tens[Character.getNumericValue(a[i+1])]+" "+suffixes[i+1]+" ");
                    else
                    System.out.print(" "+ties[b]+" "+one[Character.getNumericValue(a[i+1])]+" "+suffixes[i+1]+" ");
                    i++;
                }
            }
        }
    }
}