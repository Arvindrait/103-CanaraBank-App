package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
        private static final String REST_URL="https://www.equifax.com/getScores";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
        int a=10;
	}
      
      //HIS-200 related chanhes
      public void doprocess(){
       //goes logic here
       }
}
