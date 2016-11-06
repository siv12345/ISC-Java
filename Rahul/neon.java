/*
 * Check if a number is a neon number or not
 * A number is neon if the sum of the digit of the square
 * is equal to the number
 */
class neon
{
    public void accept(int m)
    {
        int b=m*m;
        int sum=0;
        for(int i=0;i<Integer.toString(b).length();i++)
        sum+=Integer.parseInt(Integer.toString(b).substring(i,i+1));
        System.out.println((sum==m)?m+" is neon":m+" is not neon");
    }
}