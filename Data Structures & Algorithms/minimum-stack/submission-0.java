class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top = stack.pop(); //top represents the value that is popped from the stack
        if(top == minStack.peek()){ //if top is equal to the top element of the minStack, we pop that value.
            minStack.pop();
        }


    }
    
    public int top() {
    return stack.peek();       
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
