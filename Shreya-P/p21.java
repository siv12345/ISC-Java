class p21
{
    void accept(String S)
    {
    S = S.toUpperCase();
    int i,l,l1,l2,si=0,cnt=0,c=0,j;
    String temp="",ew;
    char ch,ch1,ch2,ch3,ch4,ch5;
    l=S.length();
    for(i=0;i<l;i++)
    {
        ch=S.charAt(i);
        if(ch ==' '||ch ==','||ch =='.')
        {   temp="";
            c++;
            ew=S.substring(si,i);
            si=i+1;
            l1=ew.length();
            for( j=l1-1;j>=0;j--)
            {
                ch1=ew.charAt(j);
                temp=temp+ch1;
            }
            if (ew.equalsIgnoreCase(temp))
            {
                System.out.println("palindrome="+ew);
                cnt++;
            }    
            ch2= ew.charAt(0);
            if(ch2== 'A'||ch2== 'E'||ch2== 'I'||ch2== 'O'||ch2== 'U')
            {
                System.out.println("word with vowel="+ew);
            }
        }
    }
      System.out.println("No. of palindromic words="+cnt);
      String arr[]=new String[c];
      l2=arr.length;
      int d=0,b=0;
      for(i=0;i<l;i++)
      {
          ch3=S.charAt(i);
          if(ch3==' '||ch3 =='.'||ch3 =='?'||ch3 =='!')
          {
              arr[b]=S.substring(d,i);
              b++;
               d=i+1;
          }
     }
     for(i=0;i<l2-1;i++)
     {
         for(j=0;j<l2-1;j++)
         {
             String temp1="";
             if(arr[j].compareTo(arr[j+1])>0)
             {
                 temp1=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp1;
                }
            }
        }
        for(i=0;i<l2;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}