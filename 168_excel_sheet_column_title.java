class Solution {
    public String convertToTitle(int columnNumber) {
        String col = "";
        char ch;
        while(columnNumber>0) {
            columnNumber-=1;
            // int d = columnNumber%26 + 65;
            ch = (char)(columnNumber%26 + 65);
            col = ch + col;
            columnNumber /= 26;
        }
        return col;
    }
}