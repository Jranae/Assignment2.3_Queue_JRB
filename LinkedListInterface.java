import java.util.NoSuchElementException;

public class LinkedListInterface<T> {
    private Node<T> head;
    private int length;
    private Node<T> tail;

    public LinkedListInterface() { 
        head = null;
        length = 0;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length() { 
        return length; 
    }

    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = aNode;
        } else {
            tail.next = aNode;
            tail = aNode;
        }
        length++;
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("The list is empty");
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        length--;
        return data;
    }

    public Node<T> getList() {
        return head;
    }
}
