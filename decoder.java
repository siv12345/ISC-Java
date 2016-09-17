class decoder
{
    public void accept(String coded,int shift)
    {
        for(int i=0;i<coded.length();i++)
        {
            if(shift<1||shift>26)
            System.exit(1);
            else if(coded.charAt(i)=='Q'&&coded.charAt(i+1)=='Q'){
            System.out.print(" ");
            i++;}
            else if((int)coded.charAt(i)+shift<=90&&coded.charAt(i)!=' ')
            System.out.print((char)((int)coded.charAt(i)+shift-1));
            else if((int)coded.charAt(i)+shift>90&&coded.charAt(i)!=' ')
            System.out.print((char)((int)coded.charAt(i)+shift-92+65));
          }
      }
}
