package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.service.BookService;

@RestController
@RequestMapping("book")
public class BookController 
{
	
	@Autowired BookService bookser;
	
	@PutMapping("update")
	public String updateStudent(@RequestBody	Book s)
	{
		return bookser.upateBook(s);
	}
		
		
}
