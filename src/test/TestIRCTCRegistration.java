package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTestIRCTC;
import pom.POMIRCTCRegistration;

public class TestIRCTCRegistration extends BaseTestIRCTC
{
	@Test
	public void register() throws IOException
	{
		POMIRCTCRegistration task1 = new POMIRCTCRegistration(driver);
		task1.enterDetails();
	}
}
