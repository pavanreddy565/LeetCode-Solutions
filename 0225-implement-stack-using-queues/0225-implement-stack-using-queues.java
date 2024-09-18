class MyStack {
    private List<Integer> stack1;
    public MyStack() {
      stack1=new ArrayList<>();   
    }
    
    public void push(int x) {
        stack1.add(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }return stack1.remove(stack1.size()-1);
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        return stack1.get(stack1.size()-1);
    }
    
    public boolean empty() {
        return stack1.size()==0;
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