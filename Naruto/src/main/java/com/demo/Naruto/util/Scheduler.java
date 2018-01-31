package com.demo.Naruto.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.Naruto.entity.CallLog;


@Component
public class Scheduler
{
	@Autowired
	RestClientUtil util;

	@Scheduled(cron="*/5 * * * * *")
	public void run() throws InterruptedException 
	{
		Integer recentID = util.getRecentCallLogId();
		List<CallLog> callLogs = util.getCallLogs(recentID.toString());
		util.addCallDTO(callLogs);
		System.out.println("CRON SCRIPT");
	}
}
