package be.ucll.reekst420;

public class Book{
    
    private String title;
    private int numberInStock;
    private double price;
    private boolean inColor;

    public Book(String title, int numberInStock, double price, boolean inColor){
        this.title = title;
        if (numberInStock > 0){
            this.numberInStock = numberInStock;
        };
        if (price >  0)this.price = price;
        this.inColor = inColor;
    }



    public String getTitle(){
        return this.title;
    };

    public int getNumberInStock(){
        return this.numberInStock;
    };

    public double getPriceInEuro(){
        return this.price;
    }

    public double getPriceInDollars(){
         double priceDollar = this.price * 1.06;
         return priceDollar;
    }

    public boolean getColor(){
        return this.inColor;
    };







}
