package LinkedList;

public class LinkedList {
    public Node head; // Ref for the value at the head of the LinkedList -- type of NODE class
    public Node tail; // Ref for the value at the end of the LinkedList -- type of NODE class
    public int size; // Variable that is incremented everytime a new node is added

    public Node createLinkedList(int nodeValue) {
        head = new Node(); // Initializing head -- rember you already declared it at the top of the class (
                           // allowing you to use the methods of the Node class)
        Node node = new Node();

        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void insertInLinkedList(int nodeValue, int location) {

        Node node = new Node();
        node.Value = nodeValue();

        // Check If A LINKEDLIST HAS BEEN CREATED
        if (head == null) {
            createLinkedList(nodeValue);
            return;
        }
        // Adds the element to the beginning of the LinkedList if the locatio=0 (aka
        // enter this at index 0)
        else if (location == 0) {
            node.next = head;
            head = node;
        }
        // Adds the end of the linkedlist:- If location 5 is greater than the size of
        // the LL 4 at 5 to the end
        else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        }

        // Adds to any position based on the specified location
        else {
            Node tempNode = node;
            int index = 0;
            while (index < location - 1) {
                tempNode = temNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }

        size++;
    }

}
