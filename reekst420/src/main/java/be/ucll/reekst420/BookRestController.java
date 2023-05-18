package be.ucll.reekst420;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/books")
public class BookRestController {

@Autowired
private BookServices bookServices;


@GetMapping("/all")
public List<Book> getAllBooks(){
	return bookServices.getAllBooksInList();
	}




@GetMapping("/totalValue")
public double TotalPriceBook() {
	return bookServices.totalPriceCollection();
}

@GetMapping("/MostExpensive")
public Book MostExpensiveBook() {
	return bookServices.mostExpensive();
}






@GetMapping("/search/priceMoreThen/{price}")
	public List<Book> getBooksWithPriceAboveGivenPrice(@PathParam ("price") double price){
		return bookServices.priceAboveGiven(price);
	}



@GetMapping("/search")
public Book getBookWithTitle(@PathVariable ("title") String titlegiven){
	return bookServices.givenTitle(titlegiven);
}

@GetMapping("/search/inColor")
public List<Book> inColor() {
	return bookServices.bookInColor();
}


}
