package com.foobar.bar.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foobar.bar.domain.barEntity;

@Service
public class barService 
{
	@Autowired
	private barRepo barRepo;
	public List<barEntity> getData(Integer id) {
		return barRepo.getData(id);
	}

}
