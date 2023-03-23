package com.embold.ui.automation.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {

	Properties p;

	String path ="C:\\Users\\Komal\\eclipse-workspace\\embold_v2_ui_automation\\src\\test\\java\\com\\embold\\ui\\automation\\config\\config.properties";
	
    public Readconfig() throws IOException
    
    {
    	p= new Properties();
    try {
    	FileInputStream file= new FileInputStream(path);
    	p.load(file);
    }
    catch(FileNotFoundException e)
    {
    	e.printStackTrace();
    }
    	
    
    }
    	public String getUsername()
    	{
    		 String user =p.getProperty("username");
    		if(user!=null)
    		{
    			return user;
    		}
    		else
    		 throw new RuntimeException("usernmae not specified in config");
    	}
    	
    	public String getPassword()
    	{
    	 String pass =p.getProperty("password");
    	 if(pass!=null)
 		{
 			return pass;
 		}
 		else
 		 throw new RuntimeException("password not specified in config");
    	}
    	
    	public String getBaseURL()
    	{
    		String path= p.getProperty("BaseUrl");
    		if(path!=null)
    		{
    			return path;
    		}
    		else
    		 throw new RuntimeException("path/base url not specified in config");
    	}
    	
    	public String getChromeDriver()
    	{
    		String driver1= p.getProperty("chromedriver");
    		if(driver1!=null)
    		{
    			return driver1;
    		}
    		else
    		 throw new RuntimeException("driver not specified in config");
    	}
    	public String getDriver()
    	{
    		String webdriver1= p.getProperty("webdriver");
    		if(webdriver1!=null)
    		{
    			return webdriver1;
    		}
    		else
    		 throw new RuntimeException("webdriver not specified in config");
    	}
    	
    	public String getFeature()
    	{
    		String feature1= p.getProperty("feature");
    		if(feature1!=null)
    		{
    			return feature1;
    		}
    		else
    		 throw new RuntimeException("feature not specified in config");
    	}
    	
//    	public String getConfigPath() throws IOException
//    	{
//    		Readconfig rr = new Readconfig();
//           String Config_path= p.getProperty("configpath");
//    		if(Config_path!=null)
//    		{
//    			return Config_path;
//    		}
//    		else
//   		 throw new RuntimeException("configpath not specified in config");
//    	}
    	

}
