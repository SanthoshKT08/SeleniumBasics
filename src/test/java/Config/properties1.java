package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class properties1 {
	
	static Properties prop = new Properties();
	public static void main(String[] args) throws IOException {
		
		
		get_properties_file();
		set_propertie_file();
		get_properties_file();
	}
	
	public static void get_properties_file()
	{
		
		
		try {
			Properties prop = new Properties();
			InputStream input = new FileInputStream("./src/test/java/Config/config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    String url = prop.getProperty("URL");
		    System.out.println(url);
		    
		    String browser = prop.getProperty("browser");
		    System.out.println(browser);
		   } 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
		public static void set_propertie_file() throws IOException
		{
			OutputStream output = new FileOutputStream("./src/test/java/Config/config.properties");
			prop.setProperty("URL", "imarticus.org");
			prop.store(output, "hi");
		}
		
	}
	
	
