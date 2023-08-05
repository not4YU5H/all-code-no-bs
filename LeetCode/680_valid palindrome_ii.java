class Solution {
    public boolean validPalindrome(String s) {
        int h = 0;
        int t = s.length() - 1;
        
        while(h<=t){
            if(s.charAt(h) == s.charAt(t)){
                h++;
                t--;
            }
            else {
                return isPalindrome(s,h+1,t) || isPalindrome(s,h,t-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int h, int t){
        while(h<=t){
            if(s.charAt(h) == s.charAt(t)){
                h++;
                t--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}