class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        else
        {
        HashMap<Character,Integer> count1=new HashMap<>();
        HashMap<Character,Integer> count2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            count1.put(ch1,count1.getOrDefault(ch1,0)+1);
            count2.put(ch2,count2.getOrDefault(ch2,0)+1); 
        }
        return count1.equals(count2);
    }
}
}
