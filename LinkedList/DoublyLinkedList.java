package LinkedList;

public class DoublyLinkedList {

    int size;
    Node<Integer> head=new Node<>();
    Node<Integer> tail=new Node<>();

    DoublyLinkedList()
    {
        this.head=null;
        this.tail=null;
        this.size=0;
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
            tail=temp;
            return;
            
        }
        temp.next=head;
        head.prev=temp;
        head=temp;
        // tail=temp; 1 st head last me jayega so 1 node bs tail hogi
       size++;
      
    }

    void printLinkedListFromNextPoninter()
    {
        Node<Integer> temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        // System.out.println(size);
    }

    void printLinkedListFromPrevPoninter()
    {
        // Node<Integer> temp =new Node<>();
        // temp=head;
        // while(temp.next!=null)
        // {
        //    temp=temp.next;
        // }
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" ");
        //     temp=temp.prev;
        // }
        Node<Integer> temp= tail;
        
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