package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
        private Map<String, Object> cache = new HashMap<String, Object>();

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
   
       //HIS:301 changes
       public void loadDataToCache(){
        //logic
        }
      
      //HIS-200 related chanhes
      public void doprocess(){
       //goes logic here
       }
}
