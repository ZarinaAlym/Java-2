package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueDeque {
    public static void main(String[] args) {
        PriorityQueue<String>priorityQueue= new PriorityQueue<>();
        priorityQueue.add("Zamira");
        priorityQueue.add("Zarina");
        priorityQueue.add("Sanzhar");

        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());

        }
        Deque<String> deque=new ArrayDeque<>();
        deque.add("ZAmishka");
        deque.add("Zarinka");
        deque.add("Sansho");
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.pop());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pop());

        System.out.println(deque.poll());



    }
}
