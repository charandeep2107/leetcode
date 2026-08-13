class MinStack {
    Stack<Integer> stt=new Stack<>();
    Stack<Integer> min=new Stack<>();

    public MinStack() {
        

    }
    
    public void push(int value) {
        if(stt.isEmpty()){
            stt.push(value);
            min.push(value);
        }
        else{
            stt.push(value);
            min.push(Math.min(value,min.peek()));
        }
    }
    
    public void pop() {
        stt.pop();
        min.pop();
    }
    
    public int top() {
        return stt.peek();
    }
    
    public int getMin() {
        
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */