package StudentManagment;

import java.util.Scanner;

public class Student implements utility
{
    private String studentName;
    private String fatherName;
    private String motherName;
    private long adharNumber;
    
    @Override
     public void get_details()
    {
         System.out.println("*************************** *** Welcome to Student Details Portal *** ***************************");
         System.out.println("Student Name :"+this.studentName);
         System.out.println("Father Name :"+this.fatherName);
         System.out.println("Mother Name :"+this.motherName);
         System.out.println("Adhar NUmber :"+this.adharNumber);
    }
    @Override
    public void set_details()
    {  

      System.out.println("*************************** *** Welcome to Student Ragistration Portal *** ***************************");
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student Name :");
       this.studentName = sc.nextLine();
       System.out.println("Enter Father Name :");
       this.fatherName= sc.nextLine();
       System.out.println("Enter Mother Name :");
       this.motherName  = sc.nextLine();
       System.out.println("Enter Adhar Number :");
       this.adharNumber= sc.nextLong();
       System.out.println("Student Ragistered Successfully");


    }
} 
