package com.demo.Naruto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Naruto.dao.CallLogDAO;
import com.demo.Naruto.entity.ApiDisplay;
import com.demo.Naruto.entity.CallLog;

@Service
public class CallLogService {

	@Autowired
	private CallLogDAO callLogDAO;
	
	public void addCallLog(List<CallLog> callLogs) {
		callLogDAO.save(callLogs);
	}
	
	public Integer getrecentId()
	{
		return callLogDAO.getRecentCallLogId();
	}
	
	public List<ApiDisplay> getquery(Integer time,Integer dur,String status)
	{
		if(status=="unanswered")
			return callLogDAO.getResult(time);
		else
			return callLogDAO.getValue(time, dur);
	}
}
