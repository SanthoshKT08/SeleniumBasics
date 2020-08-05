package log;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class Demo {
	
	//private static Logger logger = LogManager.getLogger(Demo.class);
	
	private static Logger logger = LogManager.getLogger(Demo.class);

	public static void main(String[] args) {
		
		
		
		System.out.println("Hello");
		logger.info("information");
		logger.fatal("fatal");
		logger.error("error");
		logger.warn("warn");
		logger.trace("hello trace");
		
		System.out.println("good");

	}

}
