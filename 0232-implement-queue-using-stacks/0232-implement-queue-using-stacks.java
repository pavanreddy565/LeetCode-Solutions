import java.util.ArrayList;
import java.util.List;

class MyQueue {

    private List<Integer> stack1;
    private List<Integer> stack2;

    public MyQueue() {
        stack1 = new ArrayList<>();
        stack2 = new ArrayList<>();
    }

    public void push(int x) {
        stack1.add(x);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            return -1; // Handle empty case
        }
        return stack1.remove(0);
    }

    public int peek() {
        if (stack1.isEmpty()) {
            return -1; // Handle empty case
        }
        return stack1.get(0);
    }

    public boolean empty() {
        return stack1.isEmpty();
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
