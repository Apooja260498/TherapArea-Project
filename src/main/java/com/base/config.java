package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	public static String getBrowsername() {
		String Base=System.getProperty("user.dir");
		String filePath=Base+"/src/main/resources/config.properties";
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("browsername");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static String getAppUrl(String env) {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("app."+env+".url");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return env;
		
	}
	
	
	public static String getEmail() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("Email");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public static String getPassword() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("Password");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}

	public static String getPatientEmail() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("patientEmail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public static String getPatientInvalidEmail() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("PatientInvalidEmail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	public static String getPatientInvalidPassword() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("PatientInvalidPassword");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	
	public static String getAdminEmail() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("adminEmail");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}
	public static String getAdminPassword() {
		String base=System.getProperty("user.dir");
		String filePath=base+"/src/main/resources/config.properties";
		
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties prop=new Properties();
		String value=null;
		try {
			prop.load(fis);
			value=prop.getProperty("adminPassword");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
	}

}

