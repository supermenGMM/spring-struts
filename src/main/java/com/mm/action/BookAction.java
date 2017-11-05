package com.mm.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mm.service.BookService;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class BookAction extends ActionSupport{
	@Autowired
	private BookService  bookService;
	public String add(){
		System.out.println("bookacion add");
		bookService.add();
		return "add";
	}
	
	public String update(){
		System.out.println("update bookaction");
		bookService.update();
		return "update";
	}
	
	public String findByPage(){
	
		bookService.findByPage(1);
		return "findByPage";
	}
	
	
}
