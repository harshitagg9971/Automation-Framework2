package test;

import java.io.IOException;

import org.testng.annotations.Test;
import generics.BaseTestActitime;
import pom.POMActitimeCreateCustomer;
import pom.POMActitimeCreateTypeOfNewWork;
import pom.POMActitimeHomePage;
import pom.POMActitimeLeaveTypesPage;
import pom.POMActitimeLoginPage;
import pom.POMActitimeTaskPage;
import pom.POMActitimeTypesOfWorkPage;

public class TestActitime extends BaseTestActitime
{
	@Test(priority = 1)
	public void login() throws IOException
	{
		POMActitimeLoginPage task1 = new POMActitimeLoginPage(driver);
		task1.loginMethod();
	}
	
	@Test(priority = 2)
	public void createCustomer() throws IOException
	{
		POMActitimeHomePage task1 = new POMActitimeHomePage(driver);
		task1.taskTabMethod();
		
		POMActitimeTaskPage task2 = new POMActitimeTaskPage(driver);
		task2.creatingCustomerMethod();
		
		POMActitimeCreateCustomer task3 = new POMActitimeCreateCustomer(driver);
		task3.createCustomerMethod();
	}
	
	@Test(priority = 3)
	public void createWork() throws IOException, InterruptedException
	{
		POMActitimeHomePage task1 = new POMActitimeHomePage(driver);
		task1.typeOfWorkMethod();
		
		POMActitimeTypesOfWorkPage task2 = new POMActitimeTypesOfWorkPage(driver);
		task2.createTypeofWorkMethod();
		
		POMActitimeCreateTypeOfNewWork task3 = new POMActitimeCreateTypeOfNewWork(driver);
		task3.createWorkMethod();
		
		task2.editWorkMethod();
		task3.editWorkNameMethod();
	}
	
	@Test(priority = 4)
	public void createLeave() throws IOException, InterruptedException 
	{
		POMActitimeHomePage task1 = new POMActitimeHomePage(driver);
		task1.leaveTypesMethod();
		
		POMActitimeLeaveTypesPage task2 = new POMActitimeLeaveTypesPage(driver);
		task2.createLeaveTypeMethod();
		
		task2.editLeaveNameMethod();
	}
}
