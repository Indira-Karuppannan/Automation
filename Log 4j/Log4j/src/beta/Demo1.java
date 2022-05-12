package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo1 {

	
	private static Logger l=LogManager.getLogger(Demo1.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		l.debug("Test");
		l.info("Testing");
		l.error("erroroccured");
		l.fatal("fatal error occured");
		
	}

}
