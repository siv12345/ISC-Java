class pp1
{
    void accept(String n)
    {
        char ch;
        int l=n.length(),i;
        double temp1=0.0;
        int temp=0,a=0;
        for(i=l-1;i>=0;i--)
        {
           ch=n.charAt(i);
           if(ch=='A')
            {
                temp=10;
            }
            else if(ch=='B')
            {
                temp=11;
            }
            else if(ch=='C')
            {
                temp=12;
            }
            else if(ch=='D')
            {
                temp=13;
            }
            else if(ch=='E')
            {
                temp=14;
            }
            else if(ch=='F')
            {
                temp=15;
            }
            else 
            {
            temp=(n.charAt(i)-48);
            }
            temp1=temp1+temp *Math.pow(16,a);
            a++;
        }
        System.out.println(temp1);
    }        
        

        
    }

            