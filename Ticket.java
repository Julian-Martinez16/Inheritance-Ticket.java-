public class Ticket {
    int number;


    public Ticket(){}

    public Ticket(int number){
        this.number = number;
    }

    public double getPrice(){
        return 50.0;
    }

    public String toString() {
        return "Number: " + number + ", Price: " + getPrice();
    }
}
