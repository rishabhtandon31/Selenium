package com.cg.project.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.pagebeans.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginStepDefinition {
	private WebDriver driver;
	/*@Given("^User is on the Github login page$")
	public void user_is_on_the_Github_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Rishabh Tandon\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
	}

	@When("^User enter username and password to login into account$")
	public void user_enter_username_and_password_to_login_into_account() throws Throwable {
		By by1=By.name("login");
		WebElement searchTxt= driver.findElement(by1);
		searchTxt.sendKeys("rtandon900@gmail.com");
		By by2=By.name("password");
		searchTxt= driver.findElement(by2);
		searchTxt.sendKeys("");
		searchTxt.submit();
	}
@Then("^User goes to the github account$")
	public void user_goes_to_the_github_account() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="GitHub";
		Assert.assertEquals(expectedTitle, actualTitle);
		driver.close();
	}*/
	private LoginPage loginPage;
	@Given("^User is on the Github login page$")
	public void user_is_on_the_Github_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Rishabh Tandon\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://github.com/login");
		loginPage=PageFactory.initElements(driver, LoginPage.class);
	}
	@When("^User enter username and password to login into account$")
	public void user_enter_username_and_password_to_login_into_account() throws Throwable {
		loginPage.setUsername("rishabhtandon31");
		loginPage.setPassword("baaghi");
		loginPage.clickSignIn();
	}
	@Then("^User goes to the github account$")
	public void user_goes_to_the_github_account() throws Throwable {
		/*String actualTitle=driver.getTitle();*/
		/*String expectedTitle="GitHub";*/
		String expectedTitle="Incorrect username or password.";
		Assert.assertEquals(expectedTitle, loginPage.getActualErrorMessage());
		driver.close();
	}
}
