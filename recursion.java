class recursion
{ 
    //String S={{"Mitch"},{"kell"},{"iz"},{"an"},{"idiot"}};
    String S[]={"George","Gokul","Karthik","Michelle","Samkith"};    
    int mid,si,li;
    int reck(String S[],int si,int li,String word)
    {   
        if(si<li)
        {   
            mid=(si+li)/2;
            if(word.compareTo(S[mid])>0) return reck(S,mid+1,li,word);
            if(word.compareTo(S[mid])<0) return reck(S,si,mid-1,word);
            if(word.equalsIgnoreCase(S[mid])) return mid;
        }
        return -9999;
    }
}