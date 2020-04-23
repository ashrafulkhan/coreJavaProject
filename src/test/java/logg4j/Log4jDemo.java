package logg4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	/** important notic: src/main/recourses inside that folder will execute whice is first. if log4j2.xml then first execute but 
	 * log4j2Demo.properties will not execute. if log4j2Demo.properties first then it will execute and log4j2.xml will not. 
	 * 
	 * log4j2.properties file must be in:   src/main/resources   (otherwise properties file will not found.) 
	 * info("String massage")
	 * error("constructor massage")
	 */

	static Logger logger=LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello World......    \n");
		
		logger.trace("This is trace massage ");
		logger.info("This is information message ");
		logger.error("This is error message ");
		logger.warn("This is warning message ");
		logger.fatal("This is a fatal message ");
		

		System.out.println("Test Complited ");
		
	}

}
