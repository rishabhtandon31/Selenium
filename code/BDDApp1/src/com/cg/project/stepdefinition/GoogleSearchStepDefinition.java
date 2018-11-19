package com.cg.project.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchStepDefinition {
	private WebDriver driver;
	/*@Given("^User is on Google HomePage$")
	public void user_is_on_Google_HomePage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Rishabh Tandon\\chrome driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@When("^User search for 'Agile Methodlogy'$")
	public void user_search_for_Agile_Methodlogy() throws Throwable {
		By by=By.name("q");
		WebElement searchTxt= driver.findElement(by);
		searchTxt.sendKeys("Agile Methodology");
		searchTxt.submit();
	}

	@Then("^All links should display with 'Agile Methodlogy'$")
	public void all_links_should_display_with_Agile_Methodlogy() throws Throwable {
		String actualTitle=driver.getTitle();
		String expectedTitle="Agile Methodology - Google Search";
		assertEquals(expectedTitle, actualTitle);
		driver.close();
	}

	@When("^User search for 'Traffic Penalities PDF'$")
	public void user_search_for_Traffic_Penalities_PDF() throws Throwable {
	}

	@Then("^All links should display pdf with 'Traffic Penalities'$")
	public void all_links_should_display_pdf_with_Traffic_Penalities() throws Throwable {
	}

	@When("^User search for 'GuptaJi Tinder Wale'$")
	public void user_search_for_GuptaJi_Tinder_Wale() throws Throwable {

	}

	@Then("^All links should display videos with 'GuptaJi Tinder Wale'$")
	public void all_links_should_display_videos_with_GuptaJi_Tinder_Wale() throws Throwable {

	}*/
}
