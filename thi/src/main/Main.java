package main;

import model.User;
import User.UserManagement;

import java.util.*;

public class Main {

    public static void display(List<User> users) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        UserManagement userManagement = new UserManagement();
        User user = new User();
        List<User> list = new ArrayList<>();

        while (choice != 0) {
            System.out.println("Menu: ");
            System.out.println("1. Find All/Display All");
            System.out.println("2. Add a user");
            System.out.println("3. Update a user");
            System.out.println("4. Delete a user");
            System.out.println("5. Find by PhoneNumber");
            System.out.println("6. Read from file");
            System.out.println("7. Write to file");
            System.out.println("0. Exit");

            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-----Display All-----");
                    list = userManagement.findAll();
                    Collections.sort(list);
                    for (User user1 : list)
                        System.out.println(user1);
                    break;

                case 2:
                    System.out.println("-----Add User -----");
                    System.out.println("Enter a phone: ");
                    String phone1 = input.nextLine();
                    input.nextLine();
                    System.out.println("Input group: ");
                    String group1 = input.nextLine();
                    System.out.println("Input a User name: ");
                    String name1 = input.nextLine();
                    System.out.println("Input User gender: ");
                    String gender1 = input.nextLine();
                    System.out.println("Input a User address: ");
                    String address1 = input.nextLine();
                    System.out.println("Input DOB: ");
                    String dob1 = input.nextLine();
                    System.out.println("Input email: ");
                    String email1 = input.nextLine();
                    User addNew = new User(phone1, group1, name1, gender1, address1, dob1, email1);
                    userManagement.add(addNew);
                    list = userManagement.findAll();
                    display(list);
                    break;

                case 3:
                    System.out.println("----Edit User----");
                    System.out.println("Enter a Phone Number: ");
                    String phone2 = input.nextLine();
                    input.nextLine();
                    System.out.println("Input group: ");
                    String group2 = input.nextLine();
                    System.out.println("Input a User name: ");
                    String name2 = input.nextLine();
                    System.out.println("Input User gender: ");
                    String gender2 = input.nextLine();
                    System.out.println("Input a User address: ");
                    String address2 = input.nextLine();
                    System.out.println("Input DOB: ");
                    String dob2 = input.nextLine();
                    System.out.println("Input email: ");
                    String email2 = input.nextLine();
                    User editNew = new User(phone2, group2, name2, gender2, address2, dob2, email2);
                    userManagement.fix(phone2, editNew);
                    list = userManagement.findAll();
                    display(list);
                    break;


                case 4:
                    System.out.println("------Delete a User ----");
                    System.out.println("Enter an phoneNumber: ");
                    String deleteID = input.nextLine();
                    userManagement.delete(deleteID);
                    list = userManagement.findAll();
                    display(list);
                    break;


                case 5:
                    System.out.println("------Find By PhoneNumber-----");
                    System.out.println("Enter an Phone: ");
                    String findPhoneNumber = input.nextLine();
                    user = userManagement.findByPhone(findPhoneNumber);
                    System.out.println(user);
                    break;


                case 6:
                    System.out.println(3);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }

    }
}
