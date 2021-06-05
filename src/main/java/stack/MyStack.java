package stack;

import linkedlist.MyLinkedList;

public class MyStack<T extends Comparable<T>>{
    MyLinkedList<T> stackimplementation = new MyLinkedList<T>();
    public void push(T data){
        stackimplementation.add(data);
    }

}
