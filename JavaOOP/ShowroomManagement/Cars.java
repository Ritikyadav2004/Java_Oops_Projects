package ShowroomManagement;

import java.util.Scanner;

public class Cars  extends Showroom  {
    String car_name;
    String car_color;
    String car_fuel_type;
    String car_type;
    int car_price;


    @Override
    public void get_details()
    {
       
        System.out.println("CAR NAME :"+car_name);
        System.out.println("CAR PRICE :"+car_price);
        System.out.println("CAR COLOR :"+car_color);
        System.out.println("CAR TYPE :"+car_type);
        System.out.println("CAR FUEL TYPE :"+car_fuel_type);
    }

    @Override
    public void set_details()
    {
        System.out.println("************************************ ***   ENTER CAR DETAILS  *** ************************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("CAR NAME:");
        car_name = sc.nextLine();
        System.out.println("CAR PRICE :");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("COLOR :");
        car_color = sc.nextLine();
        System.out.println("CAR TYPE(SEDAN/SUV/) :");
        car_type = sc.nextLine();
        System.out.println("FUEL TYPE (PETROL/DIESEL):");
        car_fuel_type  = sc.nextLine();
        // sc.close();
        car_inStock++; // adding new car

    }
}
