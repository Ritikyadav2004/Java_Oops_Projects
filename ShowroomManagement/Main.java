package ShowroomManagement;

import java.util.Scanner;

interface utility {

    public void get_details();

    public void set_details();
}

public class Main {
    static void mainMenu() {
        System.out.println();
        System.out.println(
                "************************************  *** WELCOME TO SHOWROOM MANAGMENT SYSTEM ***  ************************************");
        System.out.println();
        System.out.println(
                "************************************  *** ENTER YOUR CHOICE ***  ************************************");
        System.out.println();
        System.out.println("1].ADD SHOWROOM \t\t\t 2].ADD EMPLOYEE \t\t\t 3].ADD CARS");
        System.out.println("4].GET SHOWROOM \t\t\t 5].GET EMPLOYEE \t\t\t 6].GET CARS");
        System.out.println();
        System.out.println(
                "************************************  *** ENTER 0 TO EXIT ***  ************************************");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employee employee[] = new Employee[5];
        Cars car[] = new Cars[5];
        int showroom_counter = 0; // when object bn jaye to automaticaaly ek lenght index ki badh jaye
        int car_counter = 0;
        int employee_counter = 0;
        int choice = 100;
        while (choice != 0) {
            mainMenu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM\n9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employee();
                        employee[employee_counter].set_details();
                        employee_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE\n9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[car_counter] = new Cars();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR\n9]. GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU\n0].EXIT");
                        choice = sc.nextInt();
                        break;

                     case 5:
                        for (int i = 0; i <employee_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU\n0].EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                    for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU\n0].EXIT");
                        choice = sc.nextInt();
                        break;   
                    default:
                    System.out.println("ENTER VALID CHOICE :");   
                    break;  


                }
            }

        }
        sc.close();

    }
}
