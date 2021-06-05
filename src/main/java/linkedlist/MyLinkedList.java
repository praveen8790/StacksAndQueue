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
            node.next = head;
        this.head = node;
    }
    public void append(T data){
        Node node = new Node(data);
        if(head == null) {
            this.head = node;
        }
        if(tail != null)
            this.tail.next = node;

        this.tail = node;

    }
   /* public void insert(T searchelement,T newdata){
        Node search = head;
        Node node = new Node(newdata);
        while(search != null){
            if(search.getData()==searchelement)
            {
                if(search != tail){
                    node.next = search.next;
                    search.next = node;
                    break;
                }
                else{ // to add at last of list
                    this.tail.next = node;
                    this.tail = node;
                }
            }
            search=search.next;
        }
    }*/
    public void insert(T searchelement,T newdata){
        Node search = search(searchelement);
        Node node = new Node(newdata);
        if(search != tail){
            node.next = search.next;
            search.next = node;
        }
        else{ // to add at last of list
            this.tail.next = node;
            this.tail = node;
        }
    }
    public void deleteElementAtHead(){
        if (head == null)
            System.out.println("LinkedList is Empty");
        else {
            this.head = head.next;

        }
    }
    public void deleteElementAtTail(){
        Node search = head;
        while(search.next != tail)
        {
            search = search.next;
        }
        this.tail=search;
        search.next = null;
        }

    public Node search(T data){
        Node search = head;
        while(search!=null)
        {
            if(search.getData() == data)
                return search;
            search = search.next;
        }
       return null;
    }
    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(node.getData());
            node = node.next;
        }
    }
    // these methods are for tests only.
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
