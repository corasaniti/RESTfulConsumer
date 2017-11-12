package com.corasaniti.restfulconsumer;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;


/*
 * 	https://spring.io/guides/gs/consuming-rest/
 * 
 * 	You package everything in a single, executable JAR file, 
 * 	driven by a good old Java main() method. 
 * 	Along the way, you use Spring’s support for embedding the Tomcat 
 * 	servlet container as the HTTP runtime, instead of deploying to an external instance.
 */
public class ApplicationStandAlone2 {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) 
    {
    	RestTemplate restTemplate = new RestTemplate();
    	HttpHeaders headers = new HttpHeaders();
    	headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
    	
    	//ResponseEntity<Object> response = restTemplate.exchange("urlSTR", HttpMethod.GET, headers, Object.class);
    	
    	// Mocked Rest Service on mockable.io
    	//Object response = restTemplate.getForObject("https://demo4827087.mockable.io/getDettaglioProdotti", Object.class);
    	
    	// Mocked Rest Service on myjson.com
    	Object response = restTemplate.getForObject("https://api.myjson.com/bins/ufh0j", Object.class);

    	System.out.println(response.toString());
    	
    }

}