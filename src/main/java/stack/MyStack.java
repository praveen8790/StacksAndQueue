package stack;

import linkedlist.MyLinkedList;

public class MyStack<T extends Comparable<T>>{
    MyLinkedList<T> stackimplementation = new MyLinkedList<T>();
    public void push(T data){
        stackimplementation.add(data);
    }
    public void pop(){
        stackimplementation.deleteElementAtHead();
    }
    public T peek(){
        return (T) stackimplementation.head.getData();
    }
    public void print(){
        stackimplementation.print();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(53);
        System.out.println("peek: "+stack.peek());
        stack.pop();
        stack.print();
    }
}
