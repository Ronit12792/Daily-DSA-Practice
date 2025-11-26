import org.w3c.dom.Node;


    

class Linked_list {

    // Node class (inner class)
    class Node {
        int data;       // value stored in node
        Node next;      // reference to next node

        Node(int data) {        // constructor
            this.data = data;   // set value
            this.next = null;   // next initially null
        }
    }

    Node head;    // head of linked list

    // Insert element at end of linked list
    public void insert(int data) {
        Node newNode = new Node(data);   // create new node

        if (head == null) {     // if list is empty
            head = newNode;     // new node becomes head
            return;
        }

        Node current = head;          // start from head
        while (current.next != null) { // move to last node
            current = current.next;
        }

        current.next = newNode;    // connect last node to new node
    }

    // Print entire linked list
    public void printList() {
        Node current = head;     // start at head

        while (current != null) {     // traverse until null
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");   // end of list
    }
}


// Main class to run the program
public class Linked_list1 {
    public static void main(String[] args) {

        Linked_list list = new Linked_list(); // create linked list object

        // insert values
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // print
        list.printList();
    }
}


