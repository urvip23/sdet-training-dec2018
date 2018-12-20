package com.training.businesslogic.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import com.training.businesslogic.MyBusinessLogic;

public class MyBusinessLogicTest {
	
	//Annotations are very imp for JUnit tests. If @Test is not added before the assertion it is not considered as a test
	//Before class must always be static as it should be executed only once
	@BeforeClass
	public static void setUpBeforeAll(){
		System.out.println("Hi, I'm in before class and only once.");
	}
	
	@AfterClass
	public static void tearDownAfterAll(){
		System.out.println("Hi, I'm in after class and only once.");
	}
	
	@Before
	public void setUp(){
		System.out.println("I'm in before ");
	}
	
	@After
	public void tearDown(){
		System.out.println("I'm in after");
	}
	
	MyBusinessLogic mbl = null;
	
	//JUnit tests should be public void
	//This is a negative test
	@Test(timeout=500)
	public void insertRecordTest(){
		MyBusinessLogic mbl = new MyBusinessLogic();
		int retVal = mbl.insertRecord(101, "Harry");
		
		assertEquals(1, retVal);
	}
	
	@Test(expected=RuntimeException.class)
	public void sayHelloTest(){
		MyBusinessLogic mbl = new MyBusinessLogic();
		String name = "Vimala";
		String retVal = "Hello " + name;
				
		assertEquals(retVal, mbl.sayHello(name));
		
	}

}
