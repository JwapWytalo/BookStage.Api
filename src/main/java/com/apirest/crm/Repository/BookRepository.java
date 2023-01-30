package com.apirest.crm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apirest.crm.Model.Book;
import com.apirest.crm.Model.Cliente;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
