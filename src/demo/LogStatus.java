package demo;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class LogStatus 
{
	
	@Test
	public void console() throws IOException
	{
		Layout layout= new PatternLayout("%n %d %c %m");
		
		Appender appender = new FileAppender(layout, "./reports/r.log");
		
		BasicConfigurator.configure(appender);
		
		Logger log= Logger.getLogger(this.getClass().getName());
		
		log.setLevel(Level.ALL);
		//tdiwef
		
		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
	}
	
}
