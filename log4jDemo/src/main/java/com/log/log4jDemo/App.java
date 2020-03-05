package com.log.log4jDemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	static Logger log = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
    	//Sum s =  new Sum();
    	//int sum = s.sum();
    	
    	log.debug("Debug");
        log.info("Info");
    }
}
