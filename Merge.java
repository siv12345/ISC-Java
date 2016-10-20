class Merge
{
    void main()
    {
        int B[]={1,5,6,9,11};
        int A[]={2,3,4,7,8,10,12};
        int i,j,l=A.length+B.length;
        int index=i=j=0;
        int C[]=new int[l];
        while(index<l)
        {
            if(j>=B.length || (i<A.length && A[i]<B[j]))
            {
                C[index++]=A[i++];
            }
            else
            {
                C[index++]=B[j++];
            }
        }
    
        for(i=0;i<l;i++)
        {
            System.out.println(C[i]);
        }
    }
}


