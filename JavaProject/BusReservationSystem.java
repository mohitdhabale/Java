
import java.util.*;

 public class BusReservationSystem{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> buses = new ArrayList<String>();
    static ArrayList<String> seats = new ArrayList<String>();
    static ArrayList<String> bookings = new ArrayList<String>();

    public static void main(String args[]) {
        boolean flag = true;
        while(flag){
            System.out.println("\n--------- WelCome to Bus Reservation System ---------");
            System.out.println("\n Select an option:");
            System.out.println("##### If you want to add Bus please login #####");
            System.out.println(" 1. Admin Login ");
            System.out.println(" 2. Book Bus");
            System.out.println(" 3. Show Available Seats");
            System.out.println(" 4. List of Buses Available");
            System.out.println(" 5. Logout \n");
            int option = sc.nextInt();

            //for selecting option//
            switch(option) {

                case 1: adminLogin();
                    break;

                case 2: bookBus();
                    break;

                case 3: showAvailableSeats();
                    break;

                case 4: listBuses();
                    break;

                case 5: System.out.println("--------- Logged Out ---------");
                    flag = false;
                    break;

                default: System.out.println("Invalid option, try again.");
            }
        }

    }

    //for admin login//
    static void adminLogin() {
        System.out.println("\n Enter admin password:");
        String password = sc.next();

        if(password.equals("admin123")) {
            System.out.println("--------- Welcome Admin! ---------");
            System.out.println("\n Select an option:");
            System.out.println(" 1. Add Bus");
            System.out.println(" 2. Logout \n");
            int option = sc.nextInt();

            switch(option) {
                case 1: addBus();
                    break;

                case 2: System.out.println("--------- Logged Out ---------");
                    break;

                default: System.out.println("--------- Invalid option, try again. ---------"); break;
            }
        } else {
            System.out.println("--------- Invalid password! ---------");
        }
    }

    //for add bus//
    static void addBus() {
        System.out.println("\n Enter bus name:");
        String bus = sc.next();

        if(buses.contains(bus)) {
            System.out.println("--------- Bus already added. ---------");
        } else {
            buses.add(bus);
            seats.add("32");
            System.out.println("--------- Bus added successfully. ---------");
        }
    }

    //for book bus//
    static void bookBus() {
        System.out.println("\n Enter bus name:");
        String bus = sc.next();
        System.out.println("\n --------- Maximum no. of seats are 32 ---------");

        if(!buses.contains(bus)) {
            System.out.println("--------- Bus not available. ---------");
        } else {
            System.out.println("\n Enter number of seats:");
            int numSeats = sc.nextInt();
            int index = buses.indexOf(bus);
            int availableSeats = Integer.parseInt(seats.get(index));

            if(numSeats > availableSeats) {
                System.out.println("--------- Not enough seats available. ---------");
            } else {
                String booking = bus + ":" + numSeats;
                bookings.add(booking);
                int newSeats = availableSeats - numSeats;
                seats.set(index, Integer.toString(newSeats));
                System.out.println("--------- "+ numSeats + " seats booked successfully. ---------");
            }
        }
    }

    //for showing availaible seat//
    static void showAvailableSeats() {
        System.out.println("\n Enter bus name:");
        String bus = sc.next();
        if(!buses.contains(bus)) {
            System.out.println("--------- Bus not available. ---------");
        } else {
            int index = buses.indexOf(bus);
            int availableSeats = Integer.parseInt(seats.get(index));
            System.out.println("--------- Available seats in " + bus + ": " + availableSeats +" ---------");
        }
    }

    //for availaible bus list//
    static void listBuses() {
        if(buses.size() == 0) {
            System.out.println("--------- No buses available. ---------");
        } else {
            for(int i=0; i<buses.size(); i++) {
                String bus = buses.get(i);
                int index = buses.indexOf(bus);
                int availableSeats = Integer.parseInt(seats.get(index));
                System.out.println("--------- " + bus + " - " + availableSeats + " seats available ---------");
            }
        }
    }
}
