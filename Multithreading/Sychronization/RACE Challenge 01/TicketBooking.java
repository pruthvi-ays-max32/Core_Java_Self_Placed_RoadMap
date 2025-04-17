/*
 💻 Task: Simulate a Ticket Booking System (Race Condition Version)
    🎯 Your Objective
       1. Create a TicketBooking class with a bookTicket(String name, int seats) method.
       2. It should start with 10 seats available.
       3. Create 2 Threads simulating two users trying to book 7 tickets at the same time.
       4. Don’t use synchronized in the first version — we want to see what happens in a race condition. 
*/

public class TicketBooking {
   
   int seatsAvailable = 10;

   public synchronized void bookTicket(String name, int seats) {
      if (seatsAvailable >= seats) {
          System.out.println(name + " is going to book " + seats + " seats.");
          try {
              Thread.sleep(1000); // Simulate processing time
          } catch (Exception e) {
              e.printStackTrace();
          }
          seatsAvailable -= seats;
          System.out.println(name + " completed booking. Remaining seats : " + seatsAvailable);
      } else {
          System.out.println(name + " can't book seats. Not enough available seats.");
      }
  }


   public static void main(String args[]){

      TicketBooking tb = new TicketBooking();
      PassengerThread passenger1 = new PassengerThread(tb, "ps1", 7);
      PassengerThread passenger2 = new PassengerThread(tb, "ps2", 7);

      Thread p1 = new Thread(passenger1);
      Thread p2 = new Thread(passenger2);

      p1.start();
      p2.start();
   }
}



class PassengerThread implements Runnable {
   int seats;
   String name;
   TicketBooking ticketBooking;

   PassengerThread(TicketBooking ticketBooking, String name, int seats){
      this.ticketBooking = ticketBooking;
      this.name = name;
      this.seats = seats;
   }

   @Override
   public void run(){
      ticketBooking.bookTicket(name, seats);
   }

}
