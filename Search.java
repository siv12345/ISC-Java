//Search a word in a String and count the number of times it appears in that string
class Search
{
    void main(String s,String w)
    {
        int i=0,c=0;
        String n="",str=s+" ";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            n=n+str.charAt(i);
            else
            {
                if(n.equals(w)==true)
                c++;
                n="";
            }
        }
        System.out.println(c);
    }
}
//tell us if its broken