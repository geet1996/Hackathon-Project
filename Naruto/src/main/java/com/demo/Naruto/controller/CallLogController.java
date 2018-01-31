package com.demo.Naruto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Naruto.entity.CallLog;
import com.demo.Naruto.service.CallLogService;

@RestController
public class CallLogController {

	@Autowired
	private CallLogService callLogService;
	
	@PostMapping("/calls")
	public ResponseEntity<Void> addCallLogs(@RequestBody List<CallLog> callLogs){
		callLogService.addCallLog(callLogs);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping("/id")
	public ResponseEntity<Integer> getRecentId()
	{
		Integer recentID = callLogService.getrecentId();
		return new ResponseEntity<Integer>(recentID,HttpStatus.OK);
	}
	
	@GetMapping("/filter/{time}/{status}/{duration}")
	public List getdataaaa(@PathVariable Integer time,@PathVariable String status,@PathVariable Integer duration)
	{ 
		return callLogService.getquery(time, duration, status);
	}
}
