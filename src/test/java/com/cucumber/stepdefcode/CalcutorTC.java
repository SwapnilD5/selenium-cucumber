package com.cucumber.stepdefcode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CalcutorTC {

	WebDriver w;

	
	
	@Given("Open calculator page in chrome browser")
	public void open_calculator_page_in_chrome_browser() {

		WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
		w.get("https://juliemr.github.io/protractor-demo/");
		
	}

	@When("^User should enter two enter and perform Addition operation$")
	public void user_should_enter_two_enter_and_perform_addition_operation() throws Throwable {
		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("3");
		Select sc = new Select(w.findElement(By.cssSelector("select[ng-model='operator']")));
		sc.selectByVisibleText("+");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("4");
		w.findElement(By.id("gobutton")).click();
	}

	@Then("^Result should get display and verify output value for Addition$")
	public void result_should_get_display_and_verify_output_value_for_addition() throws Throwable {
		Thread.sleep(2000);
		String outputValue = w.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals("7", outputValue);
	}

	@When("^User should enter two enter and perform Subtraction operation$")
	public void user_should_enter_two_enter_and_perform_subtraction_operation() throws Throwable {
		w.findElement(By.cssSelector("input[ng-model='first']")).sendKeys("8");
		Select sc = new Select(w.findElement(By.cssSelector("select[ng-model='operator']")));
		sc.selectByVisibleText("-");

		w.findElement(By.cssSelector("input[ng-model='second']")).sendKeys("2");
		w.findElement(By.id("gobutton")).click();
	}

	@Then("^Result should get display and verify output value for Subtraction$")
	public void result_should_get_display_and_verify_output_value_for_subtraction() throws Throwable {

		Thread.sleep(2000);
		String outputValue = w.findElement(By.cssSelector("h2.ng-binding")).getText();
		Assert.assertEquals("6", outputValue);
	}

}
