class chmtrx
{
    public static int[][] makemtrx(int ord)
    {
        int[][] arr = new int[ord][ord];
        for(int i=0;i<ord;i++)
        {
            for(int j=0;j<ord;j++)
            {
                int val = (int) (Math.random()*(100-10))+10;
                arr[i][j] = val;
            }
        }
        return arr;
    }
}