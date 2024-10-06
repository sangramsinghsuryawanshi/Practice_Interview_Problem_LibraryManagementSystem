package com.project.LP.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.LP.Model.Book;
import java.util.List;


public interface BookConn extends JpaRepository<Book, Integer>
{
	public Book findByTitle(String title);
	public Book findByQuantity(int quantity);
}
