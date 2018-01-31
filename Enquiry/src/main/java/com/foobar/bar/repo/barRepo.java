package com.foobar.bar.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.foobar.bar.domain.barEntity;

@Repository
public interface barRepo extends JpaRepository<barEntity, Integer> 
{
	@Query("SELECT b FROM barEntity b where b.id > ?1")
	public List<barEntity> getData(Integer id);
}