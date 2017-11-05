package com.mm.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public void add() {
		System.out.println("----adddddd-----");
		System.out.println(1/0);
	}

	public void update() {
		System.out.println("----update-----");
	}

	public void delete() {
		System.out.println("-----delete---");
	}

	public void select() {
		System.out.println("-----select------");
	}
}
