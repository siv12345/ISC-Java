class pigs
{
        public static void m(String s)
        {
            String word = ""; int idx = -1;
            for(int i=0;i<s.length();i++)
            {   char c = s.charAt(i);
                switch(c)
                {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U': idx = i; break;
                }
                if(idx != -1) break;
            }
            if(idx == -1) idx = 0;
            word = s.substring(idx);
            word += s.substring(0,idx);
            word += "ay";
            System.out.println("Piglatin of: "+s+" is: "+word);
        }
    }