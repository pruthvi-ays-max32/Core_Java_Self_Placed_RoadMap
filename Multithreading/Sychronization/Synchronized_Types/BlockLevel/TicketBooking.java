/*                                  Block Level Synchronization                                                        */

// package Multithreading.Sychronization.Synchronized_Types.BlockLevel;

public class TicketBooking {
  private int avaliableSeats = 10;

  public void BookTicket(String user, int seats){
      System.out.println(user + " is booking Seats");
      try{
        Thread.sleep(1000);
      } catch(InterruptedException e){
        System.out.println("Thread is Sleeping.");
      }

      synchronized(this){
      if(seats<=avaliableSeats){
        System.out.println(user + " booked " + seats + " seats");
        avaliableSeats -= seats;
        System.out.println("Remaining Seats : " + avaliableSeats);
      } else{
        System.out.println("Sorry seats are not available for user : " + user);
      }
    }
  }

  public static void main(String[] args) {
    TicketBooking ticketBooking = new TicketBooking();
    BookingThread t1 = new BookingThread("user-1", ticketBooking, 7);
    BookingThread t2 = new BookingThread("user-2", ticketBooking, 7);

    Thread userThread1 = new Thread(t1);
    Thread userThread2 = new Thread(t2);

    userThread1.start();
    userThread2.start();
  }
}


class BookingThread implements Runnable {

  int seats;
  TicketBooking ticketBooking;
  String user;
  public BookingThread(String user, TicketBooking ticketBooking, int seats) {
    this.user = user;
    this.ticketBooking = ticketBooking;
    this.seats = seats;
  }

  @Override 
  public void run(){
    ticketBooking.BookTicket(user, seats);
  }
}
