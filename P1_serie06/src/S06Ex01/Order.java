package S06Ex01;

import java.util.ArrayList;

public class Order {
    private static int idCount = 0; // static variable to keep track of all orders made
    private int id; // instance variable to assign specific id to a order object
    private String customerName, customerAddress;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Order(){
        idCount++; // Tick up the count of initialized orders
        this.id = idCount; // Assign id to this latest order
    }

    public void setCustomerName(String nameIn){
        this.customerName = nameIn;
    }

    public void setCustomerAddress(String addressIn){
        this.customerAddress = addressIn;
    }

    public void addBook(Book bookIn){
        this.books.add(bookIn);
    }

    public String toString(){
        String output = "Order id: " + id +
        ", Customer: " + this.customerName +
        ", " + this.customerAddress;
        for(Book book : this.books){
            output += "\n" + book;
        }
        return output;
    }
}
