class Solution {
    public int maxArea(int[] height) {
        int head = 0, tail = height.length - 1;
        int h1 = height[head], h2 = height[tail];
        int marea = h1>h2?(tail-head)*h2:(tail-head)*h1;
        while(head!=tail) {
            if(h1>h2) {
                tail--;
                h2 = height[tail];
            }
            else {
                head++;
                h1 = height[head];
            }
            marea = Math.max(marea,(h1>h2?(tail-head)*h2:(tail-head)*h1));
        }
        return marea;
    }
}