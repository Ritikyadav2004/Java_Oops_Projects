package LinkedList;

public class DoublyLinkedList {

    int size=0;
    Node<Integer> head=new Node<>();

    DoublyLinkedList()
    {
        head.next=null;
        head.prev=null;
    }
    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.insertHead(10);
        obj.insertHead(20);
        obj.insertHead(30);
        obj.printLinkedListFromNextPoninter();
        System.out.println();
        obj.printLinkedListFromPrevPoninter();
    }

    void insertHead(int data)
    {   
        
        Node<Integer> temp =new Node<>(data);
        if(head==null)
        {
            head=temp;
            size++;
            System.out.println("First Element inserted");
        }
        temp.next=head;
        head.prev=temp;
        head=temp;
       size++;
    }

    void printLinkedListFromNextPoninter()
    {
        Node<Integer> temp =new Node<>();
        temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        // System.out.println(size);
    }

    void printLinkedListFromPrevPoninter()
    {
        Node<Integer> temp =new Node<>();
        temp=head;
        while(temp.next.next!=null)
        {
           temp=temp.next;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
            
    }

}
class Node<T>
{
    T data;
    Node<T>prev;
    Node <T> next;
     Node()
     {
         this.prev=null;
         this.next=null;
     }
     Node(T data)
     {
        this.data=data;
         this.prev=null;
         this.next=null;

     }
}