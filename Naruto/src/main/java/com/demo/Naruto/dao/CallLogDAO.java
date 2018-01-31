package com.demo.Naruto.dao;

import java.util.List;

import org.apache.catalina.LifecycleListener;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.Naruto.entity.ApiDisplay;
import com.demo.Naruto.entity.CallLog;

@Repository
public interface CallLogDAO extends JpaRepository<CallLog, Integer> {

	@Query("SELECT MAX(cl.id) FROM CallLog cl")
	Integer getRecentCallLogId();
	
	//@Query("SELECT COUNT(*) FROM callsdb.callsinfo  WHERE status=\"answered\"")
	//Integer getSuccessCalls();
	
	@Query("SELECT new com.demo.Naruto.entity.ApiDisplay(FLOOR(TIMESTAMPDIFF(SECOND,cl.createdAt,NOW())/(?1*60))*(?1),COUNT(*)) FROM CallLog cl WHERE cl.callStatus='unanswered' GROUP BY FLOOR(TIMESTAMPDIFF(SECOND,cl.createdAt,NOW())/(?1*60))*?1")
	public List<ApiDisplay> getResult(Integer time);
	
	@Query("SELECT new com.demo.Naruto.entity.ApiDisplay(FLOOR(TIMESTAMPDIFF(SECOND,cl.createdAt,NOW())/(?1*60))*(?1),COUNT(*)) FROM CallLog cl WHERE TIME_TO_SEC(cl.callDuration)>=?2 GROUP BY FLOOR(TIMESTAMPDIFF(SECOND,cl.createdAt,NOW())/(?1*60))*?1")
	public List<ApiDisplay> getValue(Integer time,Integer duration);
}
