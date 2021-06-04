package linkedlist;

public class MyLinkedList<T> {
    Node head;
    Node tail;
    Node test;
    public void add(T data){
        Node node = new Node(data);
        if(tail == null)
            this.tail = node;
        if(head != null)
            node.next = this.head;
        this.head = node;
    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.next;
        }
    }
    // these methods are for tests only.
    public void testCaseSetter(){
        this.test = test.next;
    }
    public T testCaseMethod(){
        if (test == null) {
            this.test = head;
        }
        return (T) test.getData();
    }
}
