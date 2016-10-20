class ninetydeg
{
    void main()
    {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                arr2[j][i]=arr[i][j];
            }
        }
        int p=0,q=0;
        for(i=2;i>=0;i--,q++)
        {
            for(j=0;j<3;j++,p++)
            {
                arr[p][q]=arr2[j][i];
            }
            p=0;
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }}}
        
