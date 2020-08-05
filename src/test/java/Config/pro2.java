package Config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class pro2 {
	
	public static Properties prop = new Properties();
	
	
	
		public pro2() 
		{
			try
			{
				File src = new File("");
				FileInputStream fis = new FileInputStream("./src/test/java/Config/config.properties");
				prop.load(fis);
				
			}
			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
			}
		
		}
	public String get_url()
	{
		String URL = prop.getProperty("URL");
		return URL;
		
	}
	
	public String search()
	{
		String sear=prop.getProperty("search");
		return sear;
	}
	

	
}
