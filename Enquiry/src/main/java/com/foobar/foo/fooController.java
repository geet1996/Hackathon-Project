package com.foobar.foo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.foobar.foo.repo.fooService;

@RestController
public class fooController 
{
	@Autowired
	private fooService fooservice;
	@GetMapping("/filter/{time}/{city}/{lead}")
	public List getdataaaa(@PathVariable Integer time,@PathVariable String city,@PathVariable String lead)
	{ 
		return fooservice.getquery(time, city, lead);
	}
	
}
