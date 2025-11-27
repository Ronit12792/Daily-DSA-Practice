class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_list1 {

    Node head;

    // INSERT AT BEGINNING
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // INSERT AT POSITION
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if(position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int i = 1;

        while(i < position - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if(temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // DELETE NODE BY VALUE
    public void deleteNode(int value) {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        if(head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if(temp.next == null) {
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;
    }

    // PRINT LINKED LIST
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // MAIN
    public static void main(String[] args) {
        Linked_list1 ll = new Linked_list1();

        ll.insertAtBeginning(30);
        ll.insertAtBeginning(20);
        ll.insertAtBeginning(10);
        ll.printList();

        ll.insertAtPosition(25, 3);
        ll.printList();

        ll.deleteNode(20);
        ll.printList();
    }
}
