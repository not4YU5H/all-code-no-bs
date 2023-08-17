class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        int k = n;
        while(sum!=1) {
            if(k<10 && (k == 1 || k == 7)) {
                return true;
            } else if(k<10) {
                return false;
            }
            sum = 0;
            while(k>0) {
                int d = k%10;
                sum+= d*d;
                k/=10;
            }
            k = sum;
            if(k == n) {
                return false;
            }
        }
        return true;
    }
}