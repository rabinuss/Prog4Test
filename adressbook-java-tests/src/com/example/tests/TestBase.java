package com.example.tests;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.example.fw.ApplicationManager;

public class TestBase {
	
	public ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		Properties properties = new Properties();
		properties.load(new FileReader(new File("application.properties")));
		app = new ApplicationManager(properties);
	  }
	
	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }

}
