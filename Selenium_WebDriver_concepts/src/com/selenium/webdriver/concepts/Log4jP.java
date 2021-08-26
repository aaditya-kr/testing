package com.selenium.webdriver.concepts;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jP {

static final Logger logger1=Logger.getLogger(Log4jBasicConfigurator.class);
	
	public static void main(String[] args) {
		
		
			PropertyConfigurator.configure("src\\com\\selenium\\webdriver\\concepts\\Config1.properties");
			logger1.debug("Example for debug msg");
			logger1.info("Example for info msg");
			logger1.warn("Example for warn msg");
			logger1.error("Example for error msg");
			logger1.fatal("Example for fatal msg");
			}
}
