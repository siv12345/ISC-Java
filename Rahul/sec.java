//Code Validity Checker
class sec
{
    public void accept(int n,String str) throws InterruptedException
    {
        try
        {
            if(str.length()!=n)
            throw new Exception("INVALID, STRING LENGTH NOT THE SAME AS SPECIFIED");
            if(n>6)
            throw new Exception("INVALID, STRING LENGTH SHOULD NOT EXCEED 6");
            for(int l=0;l<n;l++)
            {
                if(Character.isLowerCase(str.charAt(l)))
                throw new Exception("INVALID, ALL CHARACTERS MUST BE UPPERCASE");
                if((int)str.charAt(l)%2!=1)
                throw new Exception("INVALID, ONLY ALTERNATE LETTERS PERMITTED");
                if((int)str.charAt(l)>75||(int)str.charAt(l)<65)
                throw new Exception("INVALID, LETTERS SHOULD BE BETWEEN A AND K");
                for(int k=0;k<n;k++)                
                if(str.charAt(l)==str.charAt(k)&&k!=l)
                throw new Exception("INVALID, NO REPETITION");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            Thread.sleep(Long.MAX_VALUE);
            System.exit(0);
        }
        System.out.println("VALID");
    }
}
