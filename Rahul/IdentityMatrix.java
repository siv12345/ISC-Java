/*
 * Program to check if a matrix is an identity matrix
 */
class IdentityMatrix
{
    public static void main(String args[])
    {
        int a[][]={{1,0,0},{0,1,0},{2,0,1}};
        boolean b=true;
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                if(row==col&&a[row][col]!=1)
                b=false;
                else if(row!=col&&a[row][col]!=0)
                b=false;
            }
        }
        if(b)
        System.out.println("MATRIX IS AN IDENTITY MATRIX");
        else
        System.out.println("MATRIX IS NOT AN IDENTITY MATRIX");
    }
}