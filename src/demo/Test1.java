package demo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Test1 
{
	
	@Test
	public void console()
	{
		
		BasicConfigurator.configure();
		
		Logger log= Logger.getLogger(this.getClass().getName());
		
		log.info("hiii");
		log.info("byee");
		log.error("hllooo");
		log.fatal("dfct");
	}
	

}
