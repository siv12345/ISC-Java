public class p231
{
    void compute(String S,int shift)
    {
        System.out.println("Coded text= "+S+"\n"+"Shift value= "+shift);
        int l=S.length(),i;
        S=S+" ";
        String temp="";
        if(shift>26)
        {  System.out.println("Invalid shift value");}
        else
        {   int a,b;
            char ch,ch1;            
            for(i=0;i<l-1;i++)
            {
                ch=S.charAt(i);
                ch1=S.charAt(i+1);
                a=ch+shift-1;
                if(ch=='Q'&&ch1=='Q')
                {   a=32;
                    i++;
                }
                if(a>90)
                {  a=a-26;  }
                if(ch!=' ')
                {  temp=temp+(char)a; }
            }        
            System.out.println("Decoded text="+temp);                
            }
        }
    }
    
