//Encryption using a shift. Can be decoded using the Decryption class.
class encryption{
    public void accept(String coded,int shift)
    {
        String str="";
        for(int i=0;i<coded.length();i++)
        {
            if(coded.charAt(i)==' ')
            str+="QQ";          
            else if(92-shift+((int)(coded.charAt(i))-65)<=90)
            str+=(char)(92-shift+((int)(coded.charAt(i))-65));
            else
            str+=(char)(65+(92-shift+((int)(coded.charAt(i))-65)-91));
        }      
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
            if(i%6==5)
            System.out.print(" ");}
    }   
}