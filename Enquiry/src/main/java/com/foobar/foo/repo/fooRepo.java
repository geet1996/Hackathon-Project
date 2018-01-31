package com.foobar.foo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foobar.foo.domain.fooEntity;

@Repository
public interface fooRepo extends JpaRepository<fooEntity, Integer> 
{
	@Query("SELECT new com.foobar.foo.repo.Display(FLOOR(TIMESTAMPDIFF(SECOND,cl.created_date,NOW())/(?1*60))*(?1),COUNT(*),cl.city_name,cl.lead_sale_type) FROM fooEntity cl WHERE cl.city_name=?2 and cl.lead_sale_type=?3 GROUP BY FLOOR(TIMESTAMPDIFF(SECOND,cl.created_date,NOW())/(?1*60))*?1")
	public List<Display> getData(Integer time,String city,String lead);
}

