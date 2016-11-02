class p19
{ 
    void search(int n)
    {
        int a[]= {1,2,3,4,5,6,7,8,9,10};
        int li,si=0,mid,k=0,l;
        l= a.length;
        li=l-1;
      while(si<=li)
      {
            mid= (si+li)/2;
       if(a[mid]==n)
       {
          System.out.println("Search successful");
          k=1;
          System.exit(0);
       }
       else if(n>a[mid])
       {
          si=mid+1;
       }
       else if(n<a[mid])
       {
          li=mid-1;
       }
      }
      if(k==0)
      {
         System.out.println("Search unsuccesful");
      }
        
    }
}
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
       
    
    
    

