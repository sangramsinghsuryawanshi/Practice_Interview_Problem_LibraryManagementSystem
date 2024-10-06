package com.project.LP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.LP.Model.Book;
import com.project.LP.Model.Library;
import com.project.LP.Repo.BookConn;
import com.project.LP.Repo.LibraryConn;

class BookNotFound extends Exception
{
	public BookNotFound(String msg) 
	{
		super(msg);
	}
}

@Controller
public class AllController {

	@Autowired
	private LibraryConn LC;
	
	@Autowired
	private BookConn BC;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "addBook.jsp";
	}
	@RequestMapping("/AL")
	public String isLandLi()
	{
		return "AddLibrary.jsp";
	}
	@RequestMapping("/insert")
	public String isAddBook(@ModelAttribute Book b , Model m)
	{
		if(BC!=null)
		{
			BC.save(b);
			m.addAttribute("msg", "Book Added successfully....!");
			return "/";
		}
		else
		{
			m.addAttribute("msg", "Something went wrong please try letter...!");
			return "/";
		}
	}
	@RequestMapping("/SB")
	public String isAddBookFetch(Model m)
	{
		List<Book> lb = BC.findAll();
		m.addAttribute("book", lb);
		return "FetchBook.jsp";
		
	}
	@RequestMapping("/addLibrary")
	public String isAddLibrary(@ModelAttribute Library l, Model m)
	{
		Library l1 = new Library();
		List<Book> lb = BC.findAll();
		for(Book b:lb)
		{
			if(!l.getBname().equals(b.getTitle()))
			{
				try
				{
					throw new BookNotFound("Book is not found..!");
				}
				catch(Exception e)
				{
					m.addAttribute("msg", e);
				}
			}
			if(l.getBquantity()>b.getQuantity())
			{
				try
				{
					throw new BookNotFound("Available quatity is "+b.getQuantity());
				}
				catch(Exception e)
				{
					m.addAttribute("msg1", e);
				}
			}
			else
			{
				l1.setBname(l.getBname());
				l1.setBquantity(l.getBquantity());
				l1.setStatus("Not returend");
				LC.save(l1);
				m.addAttribute("msg", "Added succssefully..!");
			}
		}
		return "/AL";
	}
	@RequestMapping("/RB")
	public String isAddLibraryFetch(Model m)
	{
		List<Library> ll = LC.findAll();
		m.addAttribute("book", ll);
		return "Retrun.jsp";	
	}
	@RequestMapping("/{bid}")
	public String isAddLibraryFetchUp(Model m,@PathVariable int bid)
	{
		Library ll = LC.findById(bid).orElse(null);
		ll.setStatus("returend");
		LC.save(ll);
		return "/RB";	
	}
}
