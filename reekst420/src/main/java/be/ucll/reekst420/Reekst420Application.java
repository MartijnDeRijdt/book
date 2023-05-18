package be.ucll.reekst420;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.http.codec.multipart.MultipartParser.BodyToken;




@SpringBootApplication
public class Reekst420Application {

	public static void main(String[] args) {
		Book TestBook = new Book( "Test",  5,  20,  true   );
		SpringApplication.run(Reekst420Application.class, args);
		System.out.println(TestBook.getNumberInStock() );
	}
}
