package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;



public class ConfigDataProvider {
	
	
	Properties pro;
	
	public ConfigDataProvider ()
	{
		File src=new File("C:\\Users\\sai\\eclipse-Automation testing\\E-Commerce_project\\Configration\\Config.Properties");
		
		try 
		{
			FileInputStream fis=new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is: "+e.getMessage());
		}
     }
	public String getApplicationURL() 
	{
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
		
	}
	public String getChromepath() 
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
		
	}
	public String getFirefoxPath()
	{
		String fireboxpath=pro.getProperty("fireboxpath");
		return fireboxpath;
		
	}

}
