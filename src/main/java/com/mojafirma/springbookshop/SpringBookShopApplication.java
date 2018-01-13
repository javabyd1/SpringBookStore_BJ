package com.mojafirma.springbookshop;

import com.mojafirma.springbookshop.model.Author;
import com.mojafirma.springbookshop.model.Book;
import com.mojafirma.springbookshop.model.Category;
import com.mojafirma.springbookshop.model.Publisher;
import com.mojafirma.springbookshop.repository.AuthorRepository;
import com.mojafirma.springbookshop.service.AuthorServiceImpl;
import com.mojafirma.springbookshop.service.BookServiceImpl;
import com.mojafirma.springbookshop.service.CategoryServiceImpl;
import com.mojafirma.springbookshop.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBookShopApplication implements CommandLineRunner{

	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private AuthorServiceImpl authorService;
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private PublisherServiceImpl publisherService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBookShopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Book book = new Book();
//
//		Publisher publisher = new Publisher();
//		publisher.setAdress("Warszawa");
//		publisher.setName("SuperNova");
//		publisherService.savePublisher(publisher);
//
////		Author author = new Author();
////		author.setAdress("USA");
////		author.setName("Cay");
////		author.setLastname("Horstman");
////		authorService.saveAuthor(author);
//
//		Category category = new Category();
//		category.setName("fantasy");
//		categoryService.saveCategory(category);
//
//		book.setTitle("Krew elfów");
//		book.setAuthor("Sapkowski");
//		book.setBookAuthor(authorRepository.findByName("Cay"));
//		book.setBookCategory(category);
//		book.setPublisher(publisher);
//		bookService.saveBook(book);
	}
}