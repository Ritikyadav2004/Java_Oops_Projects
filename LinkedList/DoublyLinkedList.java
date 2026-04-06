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
        
        obj.insertTail(0);
        obj.insertTail(-10);
        obj.insertTail(-20);
        // last node entered
        obj.insertNode(-30, 7);
        // inserting at head done
        obj.insertNode(40,1);

        obj.insertNode(9999,5);
        obj.insertNode(9999,5);

        obj.insertTail(-40);
        
        obj.printLinkedListFromNextPoninter();
        System.out.println("Element Inserted Now Deleting The Element");
        // obj.printLinkedListFromPrevPoninter();
        // obj.deleteNode(1);
        // obj.deleteNode(11);
        // obj.deleteNode(1);
        // obj.deleteNode(4);
        obj.deleteNode(6);
        obj.printLinkedListFromNextPoninter();
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
    
    void insertTail(int data){
        
        if(head==null)
        {
            insertHead(data);
            return;
        }
        Node<Integer> temp= new Node<>(data);
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
        size++;
    }

    void insertNode(int data, int pos)
    {
        if(pos==1)
        {
            insertHead(data);
        }
        else if(pos==size+1)
        {
            insertTail(data);
        }
        else if(1<=pos && pos<=size)
        {
            Node<Integer> temp=head;
            int counter=1;
            while(counter<pos-1)
            {
                temp=temp.next;
                counter++;
            }
            Node<Integer> newNode= new Node<>(data);
            newNode.next=temp.next;
            newNode.prev=temp;
            temp.next.prev=newNode;
            temp.next=newNode;
           
            size++;
            
        }
    }

    void deleteNode(int pos)
    {
        if (pos < 1 || pos > size) {
            System.out.println("Please Enter Valid Position");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (pos == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println("Deleted From Position 1");
        } else if (pos == size) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
            System.out.println("Deleted From Position " + pos);
        } else {
            Node<Integer> temp = head;
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
            System.out.println("Deleted From Given Position " + pos);
        }
    }

    void printLinkedListFromNextPoninter()
    {
        Node<Integer> temp =head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
        System.out.println("Size of New List is -->  "+size);
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