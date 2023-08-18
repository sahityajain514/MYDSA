public class DLL {
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;

        }
    }
    public Node head;
    public Node tail;
    static int size=0;


    public void insertAtBeg(int data){
        Node newnode=new Node(data);
        if(size==0){
            head=newnode;
            tail=newnode;
size++;
return;
        }
        head.prev=newnode;
        newnode.next=head;
        head=newnode;
size++;
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL list=new DLL();
list.insertAtBeg(3);
list.insertAtBeg(5);
list.insertAtBeg(6);
list.display();
    }
}
