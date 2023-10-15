import java.util.*;
public class Main{
    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[5];
        tickets[0] = new WalkupTicket(1);
        tickets[1]  = new advanceTicket(2,5);
        tickets[2] = new advanceTicket(3,13);
        tickets[3] = new studentAdvanceTicket(4,9);
        tickets[4] = new studentAdvanceTicket(5,20);

        for(int i = 0; i <5;i++) {
            System.out.println(tickets[i]);
        }
        

    }


}