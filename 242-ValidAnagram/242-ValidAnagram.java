// Last updated: 8/12/2026, 12:33:48 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        int c=0;
        int freq[]=new int[256];
		for(char ch1:s.toCharArray())
			freq[ch1]++;
		for(char ch2:t.toCharArray())
			freq[ch2]--;
		for (int i=0;i<256;i++)
		{
			 if(freq[i]!=0)
			   {
				c++;
			   }
		}
				if(c==0)
				{
					return true;
				}
				else 
				{
					return false;
			   }
    }
}   
