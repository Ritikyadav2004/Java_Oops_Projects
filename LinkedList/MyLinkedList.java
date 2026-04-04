package LinkedList;



public class MyLinkedList {

    Node<Integer> head;
    int size;
    MyLinkedList()
    {
      head=null;
      size=0;
    }


    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.insertTail(1);
        obj.insertTail(2);
        obj.insertTail(3);
        obj.insertTail(4);
        obj.insertTail(5);
        obj.insertTail(6);
        obj.insertHead(1);
        obj.insertHead(2);
        obj.insertHead(3);
        obj.insertHead(4);
        obj.insertHead(5);
        obj.insertHead(6);
        obj.insertNode(111111, 6);
        obj.printLL();
        obj.deleteHead();
        obj.printLL();
        obj.deleteTail();
      //   obj.deleteTail();
      //   obj.deleteTail();
      //   obj.deleteTail();
      obj.printLL();
        obj.deleteNode(5);

      
      //   obj.insertHead(1000);
        obj.printLL();
    }

     public void insertNode(int data, int pos)
     {   
      if(pos>size+1 || pos<=0)
      {
   System.out.println("Wrong input");
   return;
      }
         Node<Integer> newNode = new Node<>(data);
         if(pos==1)
         {
            // head=newNode;
            insertHead(data);
            System.out.println("Insertion done at any position");
            
  
         }

         else if(pos==size+1)
         {
            // insert at tail
            insertTail(data);
        
         }
         else
         {
         int count=1;
         Node<Integer> temp = head;
         while(count<pos-1 && temp!=null)
         {
             temp=temp.next;
             count++;
         }
         newNode.next=temp.next;
         temp.next=newNode;
         size++;
         System.out.println("Insertion is done at "+pos);
         }

     }

     public void insertHead(int data)
     { 
       Node<Integer> temp = new Node<>(data);
      if(head==null)
      {
         head=temp;
         size++;
         return;
      }

      temp.next=head;
      // head.next=null;
      head=temp;
      size++;
      System.out.println("Insertion at head done");
      

     }


     public void insertTail(int data)
     {
        Node<Integer> temp = new Node<>(data);
       
      if(head==null)
      {
         head=temp; 
         size++;
         System.out.println("Insertion at tail done");
         return;
      }
      Node<Integer> pointer=head;
      while(pointer.next!=null)
      {
         pointer=pointer.next;
      }
      pointer.next=temp;
      size++;
     
       System.out.println("Insertion at tail done");
     }

     public void printLL()
     {
      Node<Integer> temp=head;
      // if(temp.next==null)System.out.println(temp.data);
      while(temp!=null)
      {
         System.out.print(temp.data+" ");
         temp=temp.next;
      }
      System.out.println("\nSize of the list is "+size);
     }

     public void  deleteHead()
     {
      if(head==null)
      {
         System.out.println("List is Empty");
         return;
      }
      head.data=null;
      head=head.next;
      size--;
      System.out.println("Element deleted and size is "+size);
     }

     public void deleteTail()
     {
      if(head==null)
      {
         System.out.println("List is empty");
         return;
      }
      if(head.next==null)
      {
         head=null;
         size--;
         System.out.println("Deletion done");
      }
      Node<Integer> temp= head;
      while(temp.next.next!=null)
      {
         temp=temp.next;
      }
      // Node<Integer> temp2= temp.next;
      // temp2.data=null;
      temp.next=null;
      size--;
      System.out.println("Element at Tail Deleted and Size is "+size);

     }

     public void deleteNode(int position)
     {
      if(head==null|| position>size|| position<=0)
      {
         System.out.println("No element present");
         return;
      }
       if(position==1)
      {
         deleteHead();
      }
      else if(position==size)
      {
         deleteTail();
      }
      else{
         int counter=1;
         Node<Integer> temp= new Node<>();
         Node<Integer> prev= new Node<>();
         temp=head;
         while(counter<position && temp!=null)
         {
            prev=temp;
            temp=temp.next;
            counter++;
         }
         prev.next=temp.next;
         temp.next=null;
         size--;
         System.out.println("Deletion done");




            
            
      }
     }

}





class Node<T>// generics
{
     T data;
     Node<T> next;

     Node()
     {
        this.next=null;
     }
     Node( T data)
     {
        this.data=data;
        this.next=null;
     }

    
}