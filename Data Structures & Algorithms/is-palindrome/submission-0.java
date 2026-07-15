class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            while (i < j && !alphaNum(s.charAt(i))) {
                i++;
            }
            while (j > i && !alphaNum(s.charAt(j))) {
                j--;
            }
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if(Character.toLowerCase(ch1)!=Character.toLowerCase(ch2))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
