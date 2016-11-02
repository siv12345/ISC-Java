class p01
{
    void accept(String S)
    {
        char ch;
        String temp="";
        int L=S.length();
        
        for(int a=0;a<L;a=a+1)
        {
            ch=S.charAt(a);
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch))
            {
                ch=Character.toUpperCase(ch);
            }            
            temp=temp+ch;
        }
           System.out.println(temp);
    }
}

    


