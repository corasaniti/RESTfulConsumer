package com.corasaniti.restfulconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.corasaniti.restfulconsumer.model.Quote;


/*
 * 	https://spring.io/guides/gs/consuming-rest/
 * 
 * 	You package everything in a single, executable JAR file, 
 * 	driven by a good old Java main() method. 
 * 	Along the way, you use Spring’s support for embedding the Tomcat 
 * 	servlet container as the HTTP runtime, instead of deploying to an external instance.
 */
public class ApplicationStandAlone {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) 
    {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }

}