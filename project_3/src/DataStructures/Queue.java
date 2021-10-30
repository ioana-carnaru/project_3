package DataStructures;


import java.util.LinkedList;

public class Queue implements IQueue {

    private LinkedList <String> queue;

    public Queue () {
        queue = new LinkedList<>();
    }

    @Override
    public void enqueue(String item) {
        synchronized (queue) {
            queue.add(item);
        }
    }

    @Override
    public String dequeue() {
        synchronized (queue) {
            return queue.remove();
        }
    }

    @Override
    public String peek() {
        synchronized (queue) {
            return queue.peek();
        }
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
