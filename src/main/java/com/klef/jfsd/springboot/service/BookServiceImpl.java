package com.klef.jfsd.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.klef.jfsd.springboot.model.Book;
import com.klef.jfsd.springboot.repository.BookRepository;

public class BookServiceImpl implements BookService {

@Autowired
private BookRepository bookrepo;
	
//	public String upateStudent(Student s) {
//		// TODO Auto-generated method stub
//		Optional< Student>	obj=repository.findById(s.getId());
//		String msg=null;
//		if(obj.isPresent())
//		{
//		Student student=obj.get();
//		
//		//update Operation
//		student.setName(s.getName());
//		student.setAge(s.getAge());
//		student.setEmail(s.getEmail());
//		student.setContact(s.getContact());
//		student.setDepartment(s.getDepartment());
//		student.setGender(s.getGender());
//		
//		repository.save(student);
//		msg="Student Details Updated Succesfully";
//		}
//		else 
//		{
//			msg="ID not found";
//		}
//		return msg;
//	}
	
	@Override
	public String upateBook(Book s) 
	{
		Optional< Book>	obj=bookrepo.findById(s.getBid());
		String msg=null;
		if(obj!=null)
		{
			
		Book b=new Book();
		b.setBid(s.getBid());
		b.setBauth(s.getBauth());
		b.setBtitle(s.getBtitle());
		b.setBprice(s.getBprice());
		b.setByear(s.getByear());
		
		bookrepo.save(b);
		msg="saved success";
		}
		else
		{
			msg="ID not found";
		}
		return msg;
	}

}
