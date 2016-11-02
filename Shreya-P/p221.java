                                                                                               
class p221
{
     void input (String n)  
    {
        String word[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen",
                      "twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
        int i,h,m,j;
        h=Integer.parseInt(n.substring(0,2));
        m=Integer.parseInt(n.substring(3,5));
        String time="";
        if(h<12&&m<59)
        {
            System.exit(0);
        }
        
		else if(m==0)
		{
			time=word[h]+" o' clock";
		}
        else if(m==15)
        {
            time="quarter past "+word[h];
        }
		else if(m==30)
		{
			time="half past "+word[h];
		}
		else if(m==45)
		{
			time="quarter to "+word[h+1];
		}
		else if(m<30)
		{
			time=word[m]+" minutes past "+word[h];
		}
		else
		{
			time=word[60-m]+" minutes to "+word[h+1];
		}
		System.out.println(time);
		
}
}

