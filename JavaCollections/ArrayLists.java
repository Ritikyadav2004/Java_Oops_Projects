package JavaCollections;
import java.util.*;
// import java.util.List;
// import java.util.ArrayList;

class Student
    {
        int roll;
        String name;
        Student(int roll,String name)
        {
            this.roll=roll;
            this.name=name;
        }

        @Override  // bydefault object jab print hota he to tostring me convert ho jata he 
        public String toString() {
            // TODO Auto-generated method stub
            return "["+this.name+" , "+this.roll+"]";
        }

        @Override // if data same hua to yeh true return kerga and remove method ussse hata degi 
        public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Student s)
        {
           return this.roll==s.roll && this.name.equals(s.name);
        }
        return false;
        }
    }
public class ArrayLists {

    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.set(1,0);
        list.add(2,4);
        // System.out.println(list);
        list.addFirst(10);
        list.addLast(20);
        // System.out.println(list);

        List<Student>list2=new ArrayList<>();
        list2.add(new Student(1,"Valamdir Putin"));

        list2.add(new Student(2,"Ritik Yadav"));

        // System.out.println(list2);

        ListIterator<Student> listitr=list2.listIterator();
        while(listitr.hasNext())
        {
            System.out.println(listitr.next());
        }

        while (listitr.hasPrevious()) {
            System.out.println(listitr.previous());
        }

        System.out.println("Enhenced For Loop");
        for(Student s:list2)
        {
            System.out.println(s);
        }


        //DELETING INT THE LIST
        list.remove(Integer.valueOf(20));
        System.out.println(list);

       
        list.remove(2);
        System.out.println(list);


        //DOING IN LIST2 
        // IF INDEX NHI PATA HE 
        list2.add(new Student(3, "Akhbar"));
        System.out.println(list2);
        list2.remove(new Student(3, "Akhbar"));

        System.out.println(list2);

        System.out.println(list);
        System.out.println("Size of list1 "+list.size()+"\n"+"Size of list2 "+list2.size());


        //SOME METHODS FROM COLLECTIONS CLASS
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //HW --> SORT LIST 2 INCREASING ORDER OF ROLL NUMBER 






    }
}
