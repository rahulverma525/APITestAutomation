package com.rahul.testautomation.api.tests;
import java.util.List;

import org.testng.TestNG;
import org.testng.collections.Lists;


public class RunnerTest {

	public static void main(String[] args) {
	    
		 TestNG testng = new TestNG();
		  List<String> suites = Lists.newArrayList();
		    suites.add("./testng.xml");
		    testng.setTestSuites(suites);
		    testng.run();
		 
		 
		
	}
}
