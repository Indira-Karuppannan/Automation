package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	
	private static Logger l=LogManager.getLogger(Demo.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		l.debug("Test");
		l.info("Testing");
		l.error("erroroccured");
		l.fatal("fatal error occured");
		
	}

}
