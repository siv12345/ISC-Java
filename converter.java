//Convert a number into its word form
//E.g.- INPUT: 12345
//      OUTPUT:Twelve Thousand three hundred and forty five
//Note: This program does not include the 'and' in the output. It can easily be added to the program
class converter
{
    public void input(int p)
    {
        String  one[]={" "," one"," two"," three"," four"," five"," six"," seven"," eight","nine"};
        String tens[]={"ten"," eleven"," twelve"," thirteen"," fourteen","fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
        String[] suffixes={"crore","","lakh","","thousand","hundred","",""};
        String[] ties={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
        for(int n=0;n<=1000000;n++){
        String str=Integer.toString(n);
        while(str.length()!=8)
        str='0'+str;
        char[] a=str.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int b=Character.getNumericValue(a[i]);
            if(b==0)
            System.out.print("");
            else
            {
              if(i!=1&&i!=3&&i!=6)
              System.out.print(one[b]+suffixes[i]);
              else
              {
              if(b==1)
              System.out.print(tens[Character.getNumericValue(a[i+1])]+suffixes[i+1]);
              else
              System.out.print(ties[b]+one[Character.getNumericValue(a[i+1])]+suffixes[i+1]);
              i++;
              }
            }
        }
        System.out.println();
    }
}
}
