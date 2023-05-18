package be.ucll.reeks420.book.model;

import java.text.Collator;

public class Book {
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
    
        public double getPriceInDollar(){
             double priceDollar = this.price * 1.06;
             return priceDollar;
        }
    
        public boolean isInColor(){
            return this.inColor;
        };

        public double getPrice(){
            return this.price;
        }


        public void setPrice(double priceNew){
            this.price = priceNew;


        }

        public void setInColor(boolean color){
            this.inColor = color;
        }

        public void setTitle(String Title){
            this.title = Title;
        }

        public void setNumberInStock(int numberInStockSet){
            this.numberInStock = numberInStockSet;
        }

        public String colorReturn(){
            if( this.inColor == true) {return(" is ");}
            else return(" is not ");
        }

        public String toString(){
            return( this.getTitle() + " costs €" + this.getPrice() +". "+ "There are " + this.getNumberInStock() +  " items present. The book" + this.colorReturn() + "in color.");
        }
    
    
    
    
    
    
    
    
    
    
}
