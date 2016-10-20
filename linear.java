class linear
{
    void compute(String S)
    {   
        S=S+' ';
        int i, l, si=0, l1, j, count=0;
        char ch, ch1;
        String temp="", word="";
        l=S.length();
        for(i=l-1;i>0;i--)
        {
          ch=S.charAt(i);
          if(ch==' '||ch==','||ch=='.')
          word=S.substring(si,i);
          si=i+1;
          l1=word.length();
          for(j=l1-1;j>=0;j--)
          {
              ch1=word.charAt(j);
              temp=temp+ch1;
        }
        if(temp.equalsIgnoreCase(word))
        {
        System.out.println(temp);
        count++;
    } 
}
System.out.println(count);
}
}