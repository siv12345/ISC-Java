class p17
{
    void accept(String S)
    {
        int i,l,si=0,j,l1;
        char ch,ch1;
        String ew=" ", temp=" ";
        l=S.length();
        for(i=0;i<l;i++)
        {
            ch=S.charAt(i);
            if(ch==' '||ch==','||ch=='.')
            {
                ew=S.substring(si,i);
                si=i+1;
                l1=ew.length();
                for(j=l1-l;j>=0;j--)
                {
                    ch1=ew.charAt(j);
                    temp=temp+ch1;
                } 
                     System.out.print(temp+" ");
                     temp=" ";
                    
            }
               
        }   
            
    }

}  
