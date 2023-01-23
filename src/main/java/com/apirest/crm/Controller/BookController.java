package com.apirest.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.crm.Model.Cliente;
import com.apirest.crm.Repository.BookRepository;

@RestController
@RequestMapping ("/books")
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	@GetMapping
	public List<Cliente> Listar(){
		
		return bookRepository.findAll();
		
	}
	
	
}
