package tt_queue_using_linkedlist;

public class Node {
    public int key;
    public Node next;

    public Node() {
    }

    public Node(int key){
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
