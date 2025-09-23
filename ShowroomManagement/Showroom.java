package ShowroomManagement;

import java.util.Scanner;

public class Showroom implements utility{
    String Showroom_name;
    String Showroom_address;
    int total_employee;
    int car_inStock;
    int manager;
    String Manager_name;

    @Override
    public void get_details()
    {
             System.out.println("Showroom Name :"+Showroom_name);
             System.out.println("Showroom Address :"+Showroom_address);
             System.out.println("Manager :"+Manager_name);
             System.out.println("Total Employee :"+total_employee);
             System.out.println("Total cars in stock :"+ car_inStock);
    }

    @Override
    public void set_details()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("************************************ ***   ENTER SHOWROOM DETAILS  *** ************************************");
        System.out.println("SHOWROOM NAME:");
        Showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS :");
        Showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME :");
        Manager_name = sc.nextLine();
        System.out.println("TOTAL NO. OF EMPLOYEE :");
        total_employee = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK :");
        car_inStock  = sc.nextInt();
        // sc.close();
        



    }
}
