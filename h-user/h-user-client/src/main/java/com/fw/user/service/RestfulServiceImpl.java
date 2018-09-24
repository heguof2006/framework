package com.fw.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("restfulSerivce")
public class RestfulServiceImpl {

	@Value("${user.userServerPath}")
	private String url;
	
    @Autowired 
    private RestTemplate restTemplate ;

    public String getRestData(String name){
    	return this.restTemplate.getForObject(this.url+name, String.class);
    }
}