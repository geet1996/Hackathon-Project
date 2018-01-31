package com.demo.Naruto.util;
import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.Naruto.entity.CallLog;
import com.demo.Naruto.entity.CallsWrapper;
@Component
public class RestClientUtil 
{
	private static final Logger log = LoggerFactory.getLogger(RestClientUtil.class);

	public List<CallLog> getCallLogs(String id) 
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://www.makaan.com/kira/data/v3/entity/call-log?filters=id=gt="+id;

		HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		ResponseEntity<CallsWrapper> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CallsWrapper.class, 1);
		CallsWrapper callsWrapper = responseEntity.getBody();


		//System.out.println( article.getData().get(0).getCallStatus());
		//+", Duration:"+article.getUsemap().get(0).getCallDuration()
		//+", Status:"+article.getUsemap().get(0).getCallStatus()+", Date:"+article.getUsemap().get(0).getCreatedDate());


		return callsWrapper.getData();
	}

	//api tk data for db mei store "data going to body"
	public void addCallDTO(List<CallLog> callsDTOs) 
	{
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/calls";
		HttpEntity<List<CallLog>> requestEntity = new HttpEntity<List<CallLog>>(callsDTOs,headers);
		URI uri =restTemplate.postForLocation(url,requestEntity);
	}

	public Integer getRecentCallLogId() 
	{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/id";
		Integer recentID = restTemplate.getForObject(url, Integer.class);
		return recentID;

	}
	
	
//	public static void main(String args[]) 
//	{
//		RestClientUtil util = new RestClientUtil();
//		String id = util.getRecentCallLogId().toString();
//		List<CallLog> result = util.getCallLogs(id);
//		util.addCallDTO(result);
//		//		Scheduler scheduler;
//	}
}






