class MinStack {
    Stack<Integer> st1;
    Stack<Integer> st2 = new Stack<>();

    public MinStack() {
        st1=new Stack<>();
         st2.push(Integer.MAX_VALUE);
        
    }

    public void push(int val) {
        
           
        st1.push(val);
        st2.push(Math.min(val, st2.peek()));

    }

    public void pop() {
        st1.pop();
        st2.pop();

    }

    public int top() {
        return st1.peek();

    }

    public int getMin() {
        return st2.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */