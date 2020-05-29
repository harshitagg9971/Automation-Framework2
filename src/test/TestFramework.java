package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.POMFramework;

public class TestFramework extends BaseTest
{
	@Test
	public void ashu() throws IOException
	{
		POMFramework f=new POMFramework(driver);
		f.enterdetails();
	}
}
