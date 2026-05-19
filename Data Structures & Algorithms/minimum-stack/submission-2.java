class MinStack {

    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    
    public void push(int val) {
        stack.addLast(val);
        if(minStack.isEmpty())
        {
            minStack.addLast(val);
        }
        else if(minStack.peekLast() >= val)
        {
            minStack.addLast(val);
        }
    }
    
    public void pop() {
        int ele = stack.pollLast();
        if(minStack.peekLast() == ele)
        {
            minStack.pollLast();
        }
    }
    
    public int top() {
        return stack.isEmpty() ? null : stack.peekLast();
    }
    
    public int getMin() {
        return minStack.peekLast();
    }
}
