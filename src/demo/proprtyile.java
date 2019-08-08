package demo;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class proprtyile {
	@Test
	public void console() throws IOException
	{
		Logger log= Logger.getLogger(this.getClass().getName());

		log.trace("trace");
		log.debug("debug");
		log.info("info");
		log.warn("warn");
		log.error("error");
		log.fatal("fatal");
	}
	
}
