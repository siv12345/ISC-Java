/*
 * Check if a number is a Magic number
 * A number is said to be magical if the eventual sum
 * of its digits becomes one
 */
class Magic
{
    public void accept(int i)
    {
        int l=i,sum=0;
        while(Integer.toString(i).length()!=1)
        {
            for(int m=0;m<Integer.toString(m).length();m++)
            sum+=Integer.parseInt(Integer.toString(i).substring(m,m+1));
            i=sum;
        }
         System.out.println((i==1)?l+" is a magic number":l+" is not a magic number");  
    }
}