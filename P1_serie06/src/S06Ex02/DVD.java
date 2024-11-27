public class DVD implements IArticle {
    int id, year, price;
    String title;

    public DVD(int idIn, String titleIn, int yearIn, int priceIn){
        this.id = idIn;
        this.title = titleIn;
        this.year = yearIn;
        this.price = priceIn;
    }
    public int getId(){
        return this.id;
    }
    
    public int getPrice(){
        return this.price;
    }

    public String getDescription(){
        return this.id + " (DVD) " + this.title +
            ", " + this.year + ", " + this.price + " CHF";
    }
}
