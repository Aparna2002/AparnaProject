package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest 
{
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static void init() throws IOException 
	{
		fis=new FileInputStream(projectpath+"\\src\\project\\resources\\environment.properties");
		p=new Properties();
		p.load(fis);
		String e = p.getProperty("env");
		System.out.println("Instance stage:"+e);
		
		
	}


	 

}
