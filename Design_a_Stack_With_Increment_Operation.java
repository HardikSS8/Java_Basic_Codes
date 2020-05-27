class CustomStack {
    
    Stack<Integer> stack;
    int size;
    int count = 0;
    
    public CustomStack(int maxSize) {
        stack = new Stack<>();
        this.size = maxSize;
    }
    
    public void push(int x) {
        if(count < size) {
            stack.push(x);
            count++;
        }
    }
    
    public int pop() {
        if(stack.empty())
            return -1;
        else {
            count--;
            return stack.pop();
        }
    }
    
    public void increment(int k, int val) {
        
        if(count < k) {
            for(int i=0; i<count; i++) {
                stack.set(i, stack.get(i)+val);
            }
        } else {
            for(int i=0; i<k; i++)
                stack.set(i, stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
