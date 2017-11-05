package com.mm.action;


import org.springframework.beans.factory.annotation.Autowired;

import com.mm.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ActionTest1 extends ActionSupport{
	private String name;
	private double price;
	
	@Autowired
	private UserService service;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public String add(){
		System.out.println("add");
		service.add();
		return "add";
	}
	
	public String execute(){
		return SUCCESS;
	}
	
	@Override
	public void validate(){
		if(name==null||price ==1){
			this.addFieldError("name", "商品名称不能为空");
		}
	}
	
	public void init(){
		System.out.println("actionTest1 init");
	}
	
	public void destory(){
		System.out.println("actionTest1 destory");
	}
	
}
