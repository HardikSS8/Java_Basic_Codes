class Solution {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
    
        int[] stack = new int[pushed.length];
        int top = -1;
        int i = 0;
        for(int p: pushed) {
            stack[++top] = p;
            while(top >= 0 && stack[top] == popped[i]) {
                i++;
                top--;
            }
        }
        return top < 0;
    }
}
