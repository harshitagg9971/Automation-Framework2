package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTestFacebookSignUp;
import pom.POMFacebookSignup;

public class TestFacebookSignUp extends BaseTestFacebookSignUp
{
	@Test
	public void signUp() throws IOException
	{
		POMFacebookSignup task1 = new POMFacebookSignup(driver);
		task1.enterDetails();
	}
}
