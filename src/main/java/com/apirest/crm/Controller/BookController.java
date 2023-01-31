package com.apirest.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.crm.Model.Book;
import com.apirest.crm.Repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public List<Book> Listar() {

		return bookRepository.findAll();

	}

	@PostMapping
	public Book adicionar(@RequestBody Book book) {

		return bookRepository.save(book);

	}

	@PutMapping("/books/{id}")

	public Book atualizar(@PathVariable(value = "id") long bookId, @RequestBody Book bookDetails) {

		Book book = bookRepository.findById(bookId).orElse(null);

		if (book != null) {

			book.setName(bookDetails.getName());

			bookRepository.save(book);

		}

		return book;

	}

	@DeleteMapping("/books/{id}")

	public String deletar(@PathVariable(value = "id") long bookId) {

		bookRepository.deleteById(bookId);

		return "Livro deletado!";

	}

}
