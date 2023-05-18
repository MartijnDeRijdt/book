package be.ucll.reekst420;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookServices {
    
    private static List<Book> bookList = new ArrayList<>();

    public List<Book> getAllBooksInList(){
        return bookList;
    }

    public boolean addBook(Book book){
        
        if (bookList.size() == 0){
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
        }

    }


    public Book mostExpensive(){
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

    public double totalPriceCollection(){
        double sum = 0;
        for (Book book: bookList){
            sum += book.getPriceInEuro() * book.getNumberInStock();


        }
        return sum;
    }



    public List<Book> priceAboveGiven(double price){
        return bookList.stream().filter(book -> book.getPriceInEuro() > price).toList();
    }


    public Book givenTitle(String Title){
        for ( Book book : bookList){
            if (book.getTitle() == Title) {
                return book;
            }
        }

        return null;
    }










    public List<Book> bookInColor(){
        return bookList.stream().filter(book -> book.getColor() == true).toList();
    }


    
    


};

