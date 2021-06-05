package queue;

import linkedlist.MyLinkedList;

public class Queue<T extends Comparable<T>> {
    MyLinkedList queue = new MyLinkedList();
    public void enqueue(T data){
        queue.append(data);
    }

    public static void main(String[] args) {
        Queue myqueue = new Queue();
        myqueue.enqueue(56);
        myqueue.enqueue(30);
        myqueue.enqueue(70);

    }
}
