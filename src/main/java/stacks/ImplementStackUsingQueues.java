package stacks;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues<T> {

    private Queue<T> q1 = new LinkedList<>();
    private Queue<T> q2 = new LinkedList<>();

    public ImplementStackUsingQueues(Queue<T> q1, Queue<T> q2) {
        this.q1 = q1;
        this.q2 = q2;
    }
    /**
     * use 2 queues, q1 and q2
     */
    public void push(T val) {
        /**
         * Push() =>
         * 1. check which queue is empty and enqueue the element inside the empty queue
         * 2. once enqueue is done, empty the other queue
         */
        if (q1.isEmpty()) {
            q1.add(val);
            while(!q2.isEmpty()) {
                q1.add(q2.poll());
            }
            return;
        }
        if (q2.isEmpty()) {
            q2.add(val);
            while(!q1.isEmpty()) {
                q2.add(q1.poll());
            }
            return;
        }
    }

    public T pop() {
        /**
         * Pop() =>
         * 1. check which queue is not empty
         * 2. dequeue from the non empty queue
         */
        T result = null;
        if (!q2.isEmpty()) {
            result = q2.poll();
        }
        if (!q1.isEmpty()) {
            result = q1.poll();
        }
        return result;
    }

    public void printStack() {
        if(!q1.isEmpty()){
            Iterator it1 = q1.iterator();
            while (it1.hasNext()) {
                System.out.println(it1.next() + " ");
            }
            return;
        }

        if(!q2.isEmpty()){
            Iterator it2 = q2.iterator();
            while (it2.hasNext()) {
                System.out.println(it2.next() + " ");
            }
            return;
        }
    }
}
