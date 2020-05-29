package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTestYahooSignUp;
import pom.POMYahooSignUp;

public class TestYahooSignUp extends BaseTestYahooSignUp
{
	@Test
	public void signUp() throws IOException
	{
		POMYahooSignUp task1 =  new POMYahooSignUp(driver);
		task1.enterDetails();
	}
}
