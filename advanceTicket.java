public class advanceTicket extends Ticket{
    private final int daysAhead;


    public advanceTicket(int number, int daysAhead){
        super(number);
        this.daysAhead = daysAhead;
    }

    @Override
    public double getPrice(){
        if(daysAhead >= 10){
            return 30.0;
        }
        else {
            return 40.0;
        }



    }

}
