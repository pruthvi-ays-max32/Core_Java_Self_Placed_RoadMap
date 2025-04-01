/*
    Create an interface Event and 3 classes which implements this class and get print details according to it.
*/

import java.sql.*;

public class Main{
    public static void main(String args[]){
        AccountTransferEvent eve1 = new AccountTransferEvent("11234");
        MissedPaymentEvent eve2 = new MissedPaymentEvent("4321");
        PasswordChangeEvent eve3 = new PasswordChangeEvent("98789");
        
        Event [] event = {eve1,eve2, eve3};
        for(Event e : event){
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
        
    }
}

interface Event {
    Long getTimeStamp();
    void process();
}

class PasswordChangeEvent implements Event{
    private final Long createdTimestamp;
    private final String id;
    public PasswordChangeEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }
        
    @Override
    public Long getTimeStamp() { return this.createdTimestamp;}
    
    @Override
    public void process() {
    System. out.println("Customer " + id + " changed their password. "+ "Sending a confirmation email to the customer");
    }
}

class MissedPaymentEvent implements Event{
    private final Long createdTimestamp;
    private final String id;
    public MissedPaymentEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }
        
    @Override
    public Long getTimeStamp() { return this.createdTimestamp;}
    
    @Override
    public void process() {
    System. out.println("Customer " + id + " Missed their payment."+ "Sending bill to the customer");
    }
}

class AccountTransferEvent implements Event{
    private final Long createdTimestamp;
    private final String id;
    public AccountTransferEvent(String id) {
        this.id = id;
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }
        
    @Override
    public Long getTimeStamp() { return this.createdTimestamp;}
    
    @Override
    public void process() {
    System. out.println("Customer " + id + " needs to transfer their account. "+ "reaching to CTE to close old account and create new account and transfer funds of customer.");
    }
}


