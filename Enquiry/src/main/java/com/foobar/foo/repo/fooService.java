package com.foobar.foo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foobar.foo.domain.fooEntity;

@Service
public class fooService 
{
	@Autowired
	fooRepo fooRepo;
	
	
	public void  Postdata(fooEntity list)
	{
		fooRepo.save(list);
	}
	
	public List<Display> getquery(Integer time,String city,String lead)
	{
		return fooRepo.getData(time,city,lead);
	}
}
