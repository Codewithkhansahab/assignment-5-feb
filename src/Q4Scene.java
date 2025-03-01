//Railway Reservation System
//Scenario: A railway booking system stores passenger reservations. Each Passenger has attributes like
// ticketNumber, name, source, destination, and seatNumber.
//
//        Tasks:
//
//Use LinkedList<Passenger> to store reservations.
//        Add new reservations at the end of the list.
//Cancel a reservation by ticketNumber.
//Display all reserved tickets.

import java.util.LinkedList;
import java.util.Scanner;
class Passenger{
    int ticketNumber;
    String name;
    String source;
    String destination;
    int seatNumber;
    Passenger(int ticketNumber,String name,String source,String destination,int seatNumber){
        this.ticketNumber=ticketNumber;
        this.name=name;
        this.source=source;
        this.destination=destination;
        this.seatNumber=seatNumber;
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "ticketNumber=" + ticketNumber +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", seatNumber=" + seatNumber +
                '}';
    }
}
class RailwayReservationSystem{
     LinkedList<Passenger> ticketlist = new LinkedList<>();

     public void addReservation(int ticketNumber,String name, String source, String destination,int seatNumber){
      Passenger p1 = new Passenger(ticketNumber,name,source,destination,seatNumber);
         ticketlist.add(p1);
     }
     public void cancelReservation(int ticketNumber){
         ticketlist.removeIf(pas -> pas.ticketNumber == ticketNumber);
     }
     void displayAll(){
        for (Passenger pas : ticketlist)
            System.out.println(pas);
     }

}

public class Q4Scene {
    public static void main(String[] args) {

        System.out.println("Please Enter the size of the list");
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Please Enter the Ticket Number");
            int ticketNumber = Integer.parseInt(sc.nextLine());
            System.out.println("Please Enter the Name");
            String name = sc.nextLine();
            System.out.println("Please Enter the Source");
            String source = sc.nextLine();
            System.out.println("Please Enter the Destination");
            String destination = sc.nextLine();
            System.out.println("Please Enter the Seat Number");
            int seatNumber = Integer.parseInt(sc.nextLine());
            RailwayReservationSystem r1 = new RailwayReservationSystem();
            r1.addReservation(ticketNumber, name, source, destination, seatNumber);

        }
        System.out.println("All the Reservations are :");

        System.out.println("Please Enter the Ticket Number to cancel the reservation");
        int ticketNumber = Integer.parseInt(sc.nextLine());
        RailwayReservationSystem r2 = new RailwayReservationSystem();
        r2.cancelReservation(ticketNumber);
        System.out.println("This is the list of all the reservations After Cancellation");
        r2.displayAll();
        sc.close();


    }
}