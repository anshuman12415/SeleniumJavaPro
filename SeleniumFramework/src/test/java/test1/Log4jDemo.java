package test1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		System.out.println("\n..Hello..\n");
		logger.trace("trace message");
		logger.info("info message");
		logger.error("error message");
		logger.warn("warn message");
		logger.fatal("fatal message");
		
	}

}