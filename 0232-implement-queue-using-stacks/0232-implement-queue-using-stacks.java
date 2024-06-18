class MyQueue {

    Stack <Integer>st1=new Stack<>();
    Stack <Integer>st2=new Stack<>();

    public MyQueue() {
        int front=0;
        int rear=0;

    }
    
    public void push(int x) {
            //pop st1 to st2
            while(!st1.isEmpty())
            {
                
                st2.push(st1.pop());
            }

            //add ele to st1
            st1.push(x);
            //st2 to st1
            while(!st2.empty())
            {
                st1.push(st2.pop());
            }
        
    }
    
    public int pop() {
        if (st1.empty()) {
            System.out.println("Stack is empty");

        }
        int val = st1.peek();
        st1.pop();
        return val;
    }
    
    public int peek() {
      return  st1.peek();
    }
    
    public boolean empty() {
        if(st1.empty())
        return true;

        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */