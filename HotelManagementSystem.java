import java.util.Scanner;

public class HotelManagementSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Hotel Management System!");
        System.out.println("---------------------------------------");

        do {
            System.out.println("\nMain Menu:");
            System.out.println("1. Book a Room");
            System.out.println("2. Check-in");
            System.out.println("3. Check-out");
            System.out.println("4. View Room Status");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    bookRoom();
                    break;
                case 2:
                    checkIn();
                    break;
                case 3:
                    checkOut();
                    break;
                case 4:
                    viewRoomStatus();
                    break;
                case 5:
                    System.out.println("Thank you for using our system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    break;
            }
        } while (choice != 5);
    }

    public static void bookRoom() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nBook a Room");
        System.out.println("------------");
        System.out.println("Please select a room type:");
        System.out.println("1. Single Room");
        System.out.println("2. Double Room");
        System.out.println("3. Suite");
        System.out.print("Enter your choice (1-3): ");
        int roomType = input.nextInt();

        System.out.println("Please enter the number of nights you would like to stay:");
        int numNights = input.nextInt();

        // Calculate price based on room type and number of nights
        double price;
        switch (roomType) {
            case 1:
                price = numNights * 50.0;
                break;
            case 2:
                price = numNights * 75.0;
                break;
            case 3:
                price = numNights * 150.0;
                break;
            default:
                System.out.println("Invalid room type. Please try again.");
                return;
        }

        System.out.println("Your total price is $" + price);
        System.out.println("Thank you for booking with us!");
    }

    public static void checkIn() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nCheck-in");
        System.out.println("--------");
        System.out.println("Please enter your name:");
        String guestName = input.nextLine();

        System.out.println("Please enter your room number:");
        int roomNumber = input.nextInt();

        System.out.println("Welcome " + guestName + "! You are now checked in to room " + roomNumber + ".");
    }

    public static void checkOut(){
        
    }

    public static void viewRoomStatus(){

    }
}