class p02
{
    void input(String S,String S1)
    {
        int n=S.length(),m=S1.length(),i,j;
        for(i=0;i<n;i++)
        {   for(j=0;j<m;j++)
            {   if(S.charAt(i)==S1.charAt(j))
                { S=S.replace(S1.charAt(j),' ');
                  S1=S1.replace(S1.charAt(j),' ');
                }
            }
        }
        System.out.println("First word=  " +S.replace(" ","")+" Second word=  "+S1.replace(" ",""));
   }
}
