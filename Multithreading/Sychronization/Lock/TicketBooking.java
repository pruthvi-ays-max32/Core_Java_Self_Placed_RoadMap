// package Multithreading.Sychronization.Lock;


import java.util.concurrent.locks.ReentrantLock;
public class TicketBooking {

  int availableTickets = 10;
  private final ReentrantLock lock = new ReentrantLock();  // 🔐 Lock object

  public synchronized void BookTicket(String user, int seats){
    lock.lock(); // 🔒 Lock acquired

    try {
      System.out.println(user + " is tyring to book " + seats + " seats.");
      Thread.sleep(1000);
      if(availableTickets >= seats){
        System.out.println(user + " has booked " + seats + " tickets");
        availableTickets -= seats;
        System.out.println("Remaining tickets : " + availableTickets);
      } else {
        System.out.println("Sorry " + user + ", only " + availableTickets + " tickets are available" );
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock(); // 🔓 Always unlock in finally block
    }
  }

  

  public static void main(String[] args) {
    TicketBooking tb = new TicketBooking();

    System.out.println("availabvle");

    BookingThread t1 = new BookingThread(tb,"user-1", 7);
    BookingThread t2 = new BookingThread(tb,"user-2",7);

    Thread th1 = new Thread(t1);
    Thread th2 = new Thread(t2);

    th1.start();
    th2.start();
    
  }
}


class BookingThread implements Runnable {
  TicketBooking tb;
  String user;
  int seats;

  BookingThread(TicketBooking tb, String user, int seats){
    this.tb = tb;
    this.seats = seats;
    this.user = user;
  }

  @Override
  public void run(){
    tb.BookTicket(user, seats);
  }
}
