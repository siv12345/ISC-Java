 //Reverse each word of a sentence
 public class Reversen {

	public static void main(String[] args) {
		String str="India is my country?";
		str+=" ";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
				if(str.charAt(i)!=' '&&str.charAt(i)!=','&&str.charAt(i)!='.'&&str.charAt(i)!='?')
				{
					str1=str.charAt(i)+str1;
						}
				else
				{
					System.out.print(str1+" ");
					str1="";
				}				
		}
		System.out.println(str1);

	}

}
