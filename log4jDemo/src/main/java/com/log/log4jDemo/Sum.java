package com.log.log4jDemo;

import org.apache.log4j.Logger;

public class Sum {
	Logger log = Logger.getLogger(Sum.class);
	public int sum()
	{
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum +=i; 
			log.info("Sum :"+sum);
			  log.trace("Trace Message!");  
		      log.debug("Debug Message!");  
		      log.info("Info Message!");  
		      log.warn("Warn Message!");  
		      log.error("Error Message!");  
		      log.fatal("Fatal Message!");  
		      
			/*
			 * try { int a = 30/0; } catch(Exception e){ log.debug("/ by zero occured");
			 * e.printStackTrace(); }
			 */
			
		}
		
		return sum;
	}
}
