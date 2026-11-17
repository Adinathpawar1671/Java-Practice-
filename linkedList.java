import java.util.LinkedList;
import org.w3c.dom.Node;

public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }   
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //methods
    public void addFirst(int data) {

        //step 1 - create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        //step 2 - newNode next = head
        newNode.next = head;
        //step 3 - newNode = head 
        head = newNode;
    }

    public void addLast(int data) {
        //creating new Node
        Node newNode = new Node(data);
        size++;

        if (tail == null) {
            head = tail = newNode;
        }
        //previous tail next = new Node;
        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        int count = 0;
        Node temp = head;
        while (count != index - 1) {
            temp = temp.next;
            count++;
        }
        Node newNode = new Node(data);
        size++;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty!");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        Node prevNode = head;
        while (prevNode.next != tail) {
            prevNode = prevNode.next;
        }
        int val = prevNode.next.data;
        prevNode.next = null;
        tail = prevNode;
        return val;
    }

    public int findKey(int key) {
        // 1. with size

        // Node val = head;
        // int i = 0;
        // while (i < size) {
        //     if (val.data == key) {
        //         System.out.println("it is present at : " + i + " index!");
        //         return val.data;
        //     }
        //     val = val.next;
        //     i++;
        // }
        // return -1;

        // 2. Without Size

        Node val = head;
        while (val != null) {
            if (val.data == key) {
                return val.data;
            }
            val = val.next;
        }
        return -1;

    }

    public int findKeyRecurssion(int key, Node el) {

        if (el == null) {
            return -1;
        }
        if (el.data == key) {
            return el.data;
        }
        return findKeyRecurssion(key, el.next);
    }

    public void reverse() {
        Node prev = null;
        Node curr = head = tail;
        Node next;
        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        
        ll.printLinkedList();
        
        ll.addFirst(1);
        ll.printLinkedList();

        ll.addFirst(2);
        ll.printLinkedList();

        ll.addLast(3);
        ll.printLinkedList();

        ll.addLast(4);
        ll.printLinkedList();

        ll.add(2, 9);
        ll.printLinkedList();

        System.out.println(ll.size);
        
        System.out.println("removing the first node which is 2");
        System.out.println(ll.removeFirst());
        ll.printLinkedList();

        System.out.println("removing the Last node which is 4");
        System.out.println(ll.removeLast());
        ll.printLinkedList();

        System.out.println("finding out the key 3 is present in the linkedlist " + ll.findKey(3));
        // System.out.println("finding out the key 3 is present in the linkedlist "+ ll.findKeyRecurssion(3, ll.head) );
    }
}
