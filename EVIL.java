class EVIL
{
    void print(String arr[][])
    {
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==null)
                {
                    System.out.print("\t");
                    continue;
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void main(char a2,char b2,char c2,int n)
    {
        int i,j;
        int r,c,r1,c1;
        String arr[][]=new String[n][n];
        r=0;c=0;
        r1=0;c1=n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==r && j==c && r==c) || (i==r1 && j==c1))
                {
                    arr[i][j]=c2+"";
                }
                else if((j>r && j<c1) || (j<r && j>c1))
                {
                    arr[i][j]=b2+"";
                }
                else
                {
                    arr[i][j]=a2+"";
                }
            }
            r++;
            r1++;
            c++;
            c1--;
        }
        print(arr);
    }
}


