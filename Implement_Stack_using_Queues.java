class MyStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;
    
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();   
    }
  
    /** Push element x onto stack. */
    public void push(int x) {
        queue2.add(x); 
        while (!queue1.isEmpty()) { 
            queue2.add(queue1.peek()); 
            queue1.remove(); 
        } 

        Queue<Integer> q = queue1; 
        queue1 = queue2; 
        queue2 = q; 
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int top = queue1.peek();
        queue1.remove();
        return top;
    }
    
    /** Get the top element. */
    public int top() {
        return queue1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(queue1.size() == 0)
            return true;
        return false;
    }    
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
