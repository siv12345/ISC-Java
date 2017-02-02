class p042


{
        void Input(String s)
            { 
                int si=0,c=0,j=0,t;
                s=s.toUpperCase();
                String t1;
              int l=s.length();
              for(int i=0;i<l;i++)
                {
                    String ew1="";
                    char ch=s.charAt(i);
                    if(ch==' ' || ch=='.' || ch==',')
                        {
                            c++;
                            String ew=s.substring(si,i);
                            si=i+1;
                            int l1=ew.length();
                            for(int k=l1-1;k>=0;k--)                                
                                    ew1=ew1+ew.charAt(k);                                
                                if(ew.equalsIgnoreCase(ew1))                                
                                    System.out.println(ew+" is a palindromic word");                                
                            }
                        }
                        int a[]=new int[c];
                        String b[]=new String[c];
                        si=0;
                       for(int i=0;i<l;i++)
                  {
                      char ch=s.charAt(i);
                      if(ch==' ' || ch=='.' || ch==',')
                        {
                            String ew=s.substring(si,i);
                            b[j]=ew;                            
                            si=i+1;
                            int l2=ew.length();
                            a[j]=l2;
                            j++;
                        }
                    }
                        for(int d=0;d<c;d++)
                        {
                            for(int e=0;e<c-1;e++)
                                {
                                    if(a[e]>a[e+1])
                                        {
                                            t=a[e];
                                            a[e]=a[e+1];
                                            a[e+1]=t;
                                            t1=b[e];
                                            b[e]=b[e+1];
                                            b[e+1]=t1;
                                        }
                                    }
                                }
                                        System.out.println("Longest word is "+b[c-1]);
                                        System.out.println("Words in ascending order");
                                        int c1=0;
                                        for(int f=0;f<c;f++)                                            
                                                System.out.println(b[f]);
                                            for(int i=0;i<c;i++)
                                                {
                                                    String x=b[i];
                                                    for(int k=0;k<c;k++)
                                                        {                                                           
                                                            if(x.equalsIgnoreCase(b[k])&&i!=k)
                                                                {
                                                                    c1++;
                                                                    b[k]=""+Math.random();                                                                   
                                                                }
                                                            }
                                                            if(c1>=1)
                                                            {
                                                                System.out.println("Frequency of "+b[i]+" is "+(c1+1));
                                                                c1=0;
                                                        }
                                                        }}}