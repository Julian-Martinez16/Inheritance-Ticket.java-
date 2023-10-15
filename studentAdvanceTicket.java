public class studentAdvanceTicket extends advanceTicket{

    public studentAdvanceTicket(int number, int daysAhead) {
        super(number, daysAhead);
    }

    @Override
    public double getPrice(){
        double price = super.getPrice();
        return price / 2;
    }

    public String toString() {
        return super.toString() + " (ID Required) ";
    }


}
