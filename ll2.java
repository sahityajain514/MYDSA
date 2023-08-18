public class ll2 {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

    }

    public Node head;
    public Node tail;
    static int size = 0;

    // INSERTION AT BEGINNING
    public void insertAtBeg(int data) {
        Node newnode = new Node(data);

        if (size == 0) {
            head = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;

    }

    // INSERTION AT END

    public void insertAtEnd(int data) {
        Node newnode = new Node(data);
        if (size == 0) {
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    // DISPLAY LINKEDLIST
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // ADD AT ANY INDEX
    public void add(int ind, int data) {
        Node newnode = new Node(data);
        if (ind == 0) {
            insertAtBeg(data);
            return;

        }
        size++;
        Node temp = head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    // DELETE FROM FRONT
    public int deleteAtfirst() {
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // DELETE AT END
    public int deleteAtEnd() {
        int i = 0;
        Node temp = head;
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            deleteAtfirst();

        }

        while (i < size - 2) {
            temp = temp.next;
            i++;
        }

        int val = temp.next.data;

        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        ll2 list = new ll2();

        list.insertAtBeg(2);
        list.display();
        list.deleteAtfirst();

        list.display();
        list.deleteAtEnd();
        list.deleteAtEnd();
        list.display();
        System.out.println(list.size);
    }
}
