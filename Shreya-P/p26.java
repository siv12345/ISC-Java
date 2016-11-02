class p26
{
  void accept(int m,int n)
  {   
      int i,j,chk=0,cnt=0;
      String a;
      for(i=m;i<=n;i++)
      {
        a=Integer.toString(i);
        for(j=0;j<a.length();j++)
        {
            if(a.charAt(j)==a.charAt(j+1))
            {
                chk++;
            }
        }
      }
      if(chk>0)
      {
          System.out.println("Unique digit no.");
          cnt++;
      }
      System.out.println("Frequency="+cnt);  
  }
}
