package kamalbhai.kamalbhai;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ritikYadav.pageobjects.LandingPage;
import ritikyadav.testcomponents.BaseTest;

public class RahulShettySite extends BaseTest {
@Test
public void submitLogin() throws IOException
{

	LandingPage landingpage=launchApplication();
	landingpage.loginApplication("honeyritikjob75@gmail.com", "jaihanuman@123");
	landingpage.selectCheckbox();
	landingpage.clickSignIn();
	landingpage.clickForgotPassword();
	landingpage.clickResetButton();
	landingpage.getMessage();
	landingpage.clickToLogin();
	landingpage.loginApplicationagain("honeyritikjob75@gmail.com", "rahulshettyacademy");
	landingpage.clickSignIn();
	

}
	
		
	

}
