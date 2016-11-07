class anag
{
    public void accept(String str1, String str2) throws InterruptedException
    {
        int c1=0,c2=0;
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();
        if(str1.length()==str2.length())
        {
            for(int i=65;i<=90;i++)
            {
                for(int k=0;k<str1.length();k++)
                {
                    if(str1.charAt(k)==(char)i)
                    c1++;
                    if(str2.charAt(k)==(char)i)
                    c2++;
                }
                if(c1!=c2)
                {
                    System.out.println("NOPE");
                    Thread.sleep(Long.MAX_VALUE);
                    System.exit(0);
                }                
            }
            System.out.println("VALID");
        }
    }
}
