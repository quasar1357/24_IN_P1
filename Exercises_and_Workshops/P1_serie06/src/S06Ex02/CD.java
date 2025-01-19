public class CD implements IArticle {
    int id, year, price;
    String title, interpret;

    public CD(int idIn, String titleIn, String interpretIn, int yearIn, int priceIn){
        this.id = idIn;
        this.title = titleIn;
        this.interpret = interpretIn;
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
        return this.id + " (CD) " + this.title + this.interpret +
            ", " + this.year + ", " + this.price + " CHF";
    }
}
