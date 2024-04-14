import java.util.Scanner;

public class Runable {

    public static void main(String[] args) {

        Opreation opreation = new Opreation();

        opreation.list.add(new User("pankaj", "007"));

        Scanner sc = new Scanner(System.in);
        // Menu
        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Id: ");
                    String id = sc.nextLine();

                    opreation.addData(new User(name, id,));
                    break;
                case 2:
                    System.out.print("Enter id to delete: ");
                    String deleteName = sc.nextLine();
                    opreation.removeData(deleteName);
                    break;
                case 3:
                    System.out.print("Enter id to search: ");
                    String searchId = sc.nextLine();
                    User sreachdata = opreation.sreachData(searchId);
                    if (searchId != null) {
                        System.out.println("Contact found: " + sreachdata);
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 4:
                    opreation.displayAll();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}