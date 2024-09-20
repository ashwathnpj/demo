package com.package1.Trial_Project1;

import org.testng.annotations.Test;



public class TestCase1 extends LaunchQuit{
	@Test
	public void login_to_amazon() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		
	}
}
