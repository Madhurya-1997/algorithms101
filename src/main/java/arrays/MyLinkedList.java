package arrays;


class Node {
    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

public class MyLinkedList {

    private Node head;
    private int size = 0;

    public void addFront(int data) { // O(1)
        Node newNode = new Node(data);
        if (this.head == null) {
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
        return;
    }

    public void addBack(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        //now the tail node is the pointer node
        currentNode.next = newNode;
        size++;
        // newNode.next is automatically null, so not required to set it
    }

    public int getFirst() { // O(1)
        if (head == null) throw new IllegalArgumentException("Empty linked list !!!");
        return head.getData();
    }
    public int getLast() { // O(N)
        if (head == null) throw new IllegalArgumentException("Empty linked list !!!");

        Node currentNode = head;

        while(currentNode.next != null) {
            currentNode = currentNode.next;
        }

        return currentNode.getData();
    }

    public int getSize() {
        return size;
    }

    /**
     * Brute force way of finding size of linked list
     */
    public int size() { // number of elements in the linked list - O(N)

        if (head == null) {
            return 0;
        }

        int size = 1;
        Node currentNode = head;
        while(currentNode.next != null) {
            size++;
            currentNode = currentNode.next;
        }

        return size;
    }


    public void clear() { // clears the entire linked list
        this.head = null;
    }

    public void deleteValue(int data) {
        if (head == null) {
            return;
        }

        if (head.getData() == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next.getData() != data) {
            current = current.next;
        }
        current.next = current.next.next;
        return;
    }
}

