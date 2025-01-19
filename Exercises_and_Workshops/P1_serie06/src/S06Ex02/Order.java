import java.util.ArrayList;

public class Order {
    private static int idCount = 0; // static variable to keep track of all orders made
    private int id; // instance variable to assign specific id to a order object
    private String customerName, customerAddress;
    private ArrayList<IArticle> articles;

    public Order(){
        idCount++; // Tick up the count of initialized orders
        this.id = idCount; // Assign id to this latest order
        this.customerName = "";
        this.customerAddress = "";
        this.articles = new ArrayList<IArticle>();
    }

    public void setCustomerName(String nameIn){
        this.customerName = nameIn;
    }

    public void setCustomerAddress(String addressIn){
        this.customerAddress = addressIn;
    }
 
    public void add(IArticle articleIn){
        this.articles.add(articleIn);
    }

    public int getId(){
        return this.id;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getCustomerAddress(){
        return this.customerAddress;
    }

    public Iterable<IArticle> getOrderedArticles(){
        return this.articles;
    }

    public int getTotalPrice(){
        int tot = 0;
        for(IArticle a : this.getOrderedArticles()){
            tot += a.getPrice();
        }
        return tot;
    }

    public String toString(){
        String output = "Order id: " + id +
        ", Customer: " + this.customerName +
        ", " + this.customerAddress;
        for(IArticle article : this.articles){
            output += "\n" + article;
        }
        return output;
    }
}