/*
 * A program that allows the user to enter a sentence and a word to be searched
 * in the sentence and count the number of lines the searched word occurs in it
 */
class Search
{
    public void accept(String sentence,String w)
    {
        int i=0,c=0;
        String n="",str=sentence+" ";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            n=n+str.charAt(i);
            else if(str.charAt(i)==' ')
            {
                if(n.equalsIgnoreCase(w))
                c++;
                n="";
            }
        }
        System.out.println(c);
    }
}