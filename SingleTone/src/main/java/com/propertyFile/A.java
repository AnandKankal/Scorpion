package com.propertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class A {
	static A a;
	static Properties p;
	static Sheet sh;

	private A() {
		try 
		{
			FileInputStream fis = new FileInputStream("E:\\myWorkspace2\\Fbatch24FebHW\\src\\login.properties");
			p =  new Properties();
			p.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static A getInstance()
	{
		if(a == null)
		{
			a = new A();
			return a;
		}
		return a;
	}
	
	public static String getPropertyByKey(String key)
	{
		if(p != null)
		{
			String username=p.getProperty(key);
			return username;
		}
		else
		{
			return "You can't access.";
		}
		
	}

}
