package ShowroomManagement;
import java.util.UUID;
import java.util.Scanner;

public class Employee  extends Showroom {
    
    String emp_id;
    String emp_name;
    String emp_dob;
    String emp_dept;

    @Override
    public void get_details()
    {
      System.out.println("EMPLOYEE NAME :"+emp_name);
      System.out.println("EMPLOYEE ID :"+emp_id);
      System.out.println("EMPOLYEE DOB :"+emp_dob);
      System.out.println("EMPLOYEE DEPARTMENT :"+emp_dept);

    }
    @Override
    public void set_details()
    {
       Scanner sc  = new Scanner(System.in);
       System.out.println("************************************ ***   ENTER EMPLOYEE DETAILS  *** ************************************");
       System.out.print("EMPLOYEE NAME :");
       emp_name = sc.nextLine();
    //    System.out.println("EMPLOYEE ID :");
       UUID vvid = UUID.randomUUID();
       emp_id = String.valueOf(vvid);
       System.out.print("EMPLOYEE DEPARTMENT :");
       emp_dept=sc.nextLine();
       System.out.print("EMPLOYEE DOB (DD/MM/YY) :");
       emp_dob=sc.nextLine();
    //    sc.close();

    }
}
