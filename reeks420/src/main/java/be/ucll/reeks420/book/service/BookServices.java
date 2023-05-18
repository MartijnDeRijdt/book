package be.ucll.reeks420.book.service;

import java.util.ArrayList;
import be.ucll.reeks420.book.model.*;
import java.util.List;

import org.springframework.stereotype.Service;

public class BookServices {
    


   



//@Service 
private static List<Book> bookList = new ArrayList<>();

public List<Book> getBooks(){
        return bookList;
    }

    public boolean addBook(Book book){
        
        if(book == null){return false;}
        else{if (bookList.size() == 0){
            bookList.add(book);
            return true;
        }
        else{
            for(Book bookx : bookList){
                if( bookx.getTitle().equalsIgnoreCase(book.getTitle()) ){
                    return false;
                }
            }
            bookList.add(book);
            return true;
        }}

    }


public Book getMostExpensiveBook(){
        //book 
        double bookExpensive = 0; //null
        Book nullBook = null;
        if( bookList.size() == 0){
            return null;
        }
        else {
            
            for(Book bookx : bookList){

                if( bookx.getPriceInEuro() > bookExpensive){ //bookExpensive.getPriceInEuro ()
                    bookExpensive = bookx.getPriceInEuro();
                    nullBook = bookx; //book bewaren niet prijs
                }

            }
        }
        return nullBook;

    }

public double getTotalValueOfCollection(){
        double sum = 0;
        for (Book book: bookList){
            sum += book.getPriceInEuro() * book.getNumberInStock();


        }
        return sum;
    }



    public List<Book> getBooksWithPriceMoreThen(double price){
        return bookList.stream().filter(book -> book.getPriceInEuro() > price).toList();
    }


    public Book getBookWithTitle(String Title){
        for ( Book book : bookList){
            if (book.getTitle() == Title) {
                return book;
            }
        }

        return null;
    }










    public List<Book> getBooksInColor(){
        return bookList.stream().filter(book -> book.isInColor() == true).toList();
    }

    public void removeBook(Book book){
        for (Book bookx : bookList){
            if (bookx.equals(book)){
                bookList.remove(book);
            }
        }
    }

    public void removeBookWithTitle(String title){
        for (Book bookx: bookList){
            if (bookx.getTitle().equals(title)){
                bookList.remove(bookx);

            }

        }
    }

    public List<Book> bookInColor() {
        return bookList.stream().filter(book -> book.isInColor() == true).toList();
    }

    public Book givenTitle(String titlegiven) {
        return bookList.stream().filter(book -> book.getTitle().equals(titlegiven)).toList().get(0);
    }

    public List<Book> priceAboveGiven(double price) {
        return bookList.stream().filter(book -> book.getPrice() >= price).toList();
    }

    public Book mostExpensive() {
        Book bookexp = null;
        double pricemax = 0;
        for(Book book: bookList){
            if (book.getPrice() > pricemax){
                pricemax = book.getPrice();
                bookexp = book;
            }


        }
        return bookexp;
    }

    public double totalPriceCollection() {
        double totalprice = 0;
        for(Book book: bookList){
            totalprice += book.getPrice() * book.getNumberInStock();

        }
        return totalprice;
    }

    public List<Book> getAllBooksInList() {
        return bookList;
    }
;


}
