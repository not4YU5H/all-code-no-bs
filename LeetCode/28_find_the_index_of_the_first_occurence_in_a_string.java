class Solution {
    public int strStr(String haystack, String needle) {
        int l = haystack.length();
        int l1 = needle.length();
        if(l>=l1)
        {
            if(haystack.substring(0,l1).equals(needle)) {
                return 0;
            }
            for(int i = 0;i<l-l1;i++) {
                if(haystack.substring(i,i+l1).equals(needle)) {
                    return i;
                }
            }
            if(haystack.substring(l-l1,l).equals(needle)) {
                return l-l1;
            }
        }
        return -1;
    }
}