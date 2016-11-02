class p07
{
    void accept(String S,String w)
    {
        int i,l,si=0,cnt=0;
        char ch;
        String ew;
        l=S.length();
        for(i=0;i<l;i++)
        {
            ch=S.charAt(i);
            if(ch ==' '|| ch ==','||ch =='.')
            {
                ew=S.substring(si,i);
                si=i+1;               
                if(w.equalsIgnoreCase(ew))
                {
                    cnt=cnt+1;
                }
            }
        }
        System.out.println("Frequency="+cnt);
    }
}

        
