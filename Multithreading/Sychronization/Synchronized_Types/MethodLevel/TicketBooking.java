// package Multithreading.Sychronization.Synchronized_Types.MethodLevel;

public class TicketBooking {
  int avaliableSeats = 10;

  public synchronized void BookTicket(String user, int seats){

      System.out.println(user + " is trying to book " + seats + " tickets.");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("Thread is Sleeping.");
      }

      if(seats <= avaliableSeats){
        avaliableSeats -= seats;
        System.out.println(user + " booked " + seats + " seats.");
        System.out.println("Remaining Seats : " + avaliableSeats);
      } else{
        System.out.println(user + " can't book " + seats + " seats. Only " + avaliableSeats + " seats are available now.");
      }
      
  }

  public static void main(String args[]){
    TicketBooking ticketBooking = new TicketBooking();

    BookingThread t1 = new BookingThread(ticketBooking, "User-1", 7);
    BookingThread t2 = new BookingThread(ticketBooking, "User-2", 7);

    Thread userThread1 = new Thread(t1);
    Thread userThread2 = new Thread(t2);

    userThread1.start();
    userThread2.start();
  }
}



class BookingThread implements Runnable {

  TicketBooking ticketBooking;
  int seats;
  String user;

  BookingThread(TicketBooking ticketBooking, String user, int seats){
    this.ticketBooking = ticketBooking;
    this.seats = seats;
    this.user = user;
  }

  @Override
  public void run(){
    ticketBooking.BookTicket(user, seats);
  }
}