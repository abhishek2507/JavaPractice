package Day13.stackqueue;
import java.util.*;

class StackUsingQueue {

    private Queue<Integer> queue;
    public StackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);

        // Rotate the queue to simulate stack behavior
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.poll();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
