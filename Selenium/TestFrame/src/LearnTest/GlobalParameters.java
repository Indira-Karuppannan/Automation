package LearnTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParameters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\rajus\\Selenium\\TestFrame\\src\\LearnTest\\data.properties");
		p.load(fin);
		System.out.println(p.getProperty("Browser"));
		System.out.println(p.getProperty("URL"));
		p.setProperty("URL","https://google.com");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\rajus\\Selenium\\TestFrame\\src\\LearnTest\\data.properties");
		p.store(fos, null);
		System.out.println(p.getProperty("URL"));
		
		
	}

}
