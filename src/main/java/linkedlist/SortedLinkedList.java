package linkedlist;

public class SortedLinkedList<T extends Comparable<T>> {
    Node head;
    Node tail;
    Node test;
    public void sortedAdd(T data) {
        Node node = new Node(data);
        Node temp;
        if(head == null){
            head=node;
            tail=node;
        }
        else if(head.getData().compareTo(data)>0)
            add(data);
        else{
            temp=head;
            while(temp.next != null && temp.next.data.compareTo(data) < 0)
                temp=temp.next;
            insert(temp,data);
        }
    }
    public void insert(Node previousnode,T newdata){
        Node node = new Node(newdata);
        if(previousnode != tail){
            node.next = previousnode.next;
            previousnode.next = node;
        }
        else{ // to add at last of list
            this.tail.next = node;
            this.tail = node;
        }
    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.next;
        }
    }
    public void add(T data){
        Node node = new Node(data);
        if(tail == null)
            this.tail = node;
        if(head != null)
            node.next = head;
        this.head = node;
    }

    public void testCaseSetHead(){
        this.test=head;
    }
    public void testCaseSetter(){
        this.test = test.next;
    }
    public T testCaseMethod(){
        return (T) test.getData();
    }
}
