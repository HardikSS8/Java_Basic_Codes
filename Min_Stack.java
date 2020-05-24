class MinStack {

    Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<Integer>();
    }
    public void push(int x) {
        stack.push(x);
    }
    public void pop() {
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }
   
    public int getMin() {
         int min = Integer.MAX_VALUE;
        for(Integer i : stack){
            if(i < min)
                min = i;
        }
        return min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
