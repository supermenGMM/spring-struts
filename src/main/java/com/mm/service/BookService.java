package com.mm.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class BookService {
	public void add() {
		System.out.println("----add book-----");
	}

	public void update() {
		
		System.out.println("----update--book---");
	}

	public void delete() {
		System.out.println("-----delete  book---");
	}

	public void select() {
		System.out.println("-----select----book--");
	}
	
	public void findByPage(int page){
		Assert.notNull(page);
		System.out.println("find by page");
	}
}
