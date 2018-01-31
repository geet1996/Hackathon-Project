package com.foobar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.foobar.bar.domain.barEntity;
import com.foobar.bar.repo.barService;
import com.foobar.foo.domain.fooEntity;
import com.foobar.foo.repo.fooService;

@Component
public class RestUtil 
{
	@Autowired
	public barService barservice;
	@Autowired
	public fooService fooservice;
	
	@Scheduled(cron="*/5 * * * * *")
	public void run() throws InterruptedException
	{
		Integer id = 8140350;
		List<barEntity> list= barservice.getData(id);
		System.out.println(list.size());
		for(barEntity b:list)
		{
			fooEntity fEntity=new fooEntity();
			fEntity.setId(b.getId());
			fEntity.setCity_name(b.getCity_name());
			fEntity.setCreated_date(b.getCreated_date());
			fEntity.setLead_sale_type(b.getLead_sale_type());
			
			System.out.println(fEntity.getCity_name());
			fooservice.Postdata(fEntity);
		}
	}
	
}



