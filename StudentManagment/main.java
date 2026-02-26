package StudentManagment;
import java.util.Scanner;
interface utility{

    void get_details();
    void set_details();
}
public class main {
   public static void main(String[] args) {
     Student s1[] = new Student[5];
     System.out.println("Enter Your Choice:");
     int stuCounter=0;
     Scanner sc= new Scanner(System.in);
     int choice=100;
     while (choice!=0) {
       choice=sc.nextInt();
        switch(choice)
    {
        case 1:
            s1[stuCounter]=new Student();
            s1[stuCounter].set_details();
            stuCounter++;
            break;
        case 2:
            for (int i = 0; i < stuCounter; i++) {
                s1[i].get_details();
            }
       
        default:
            break;
    }
     }
   }



}
