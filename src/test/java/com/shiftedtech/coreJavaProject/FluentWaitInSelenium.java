package com.shiftedtech.coreJavaProject;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitInSelenium {
	/**
	 * To Avoid Deprecation error import java.time.Duration;
	 *  Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
	 * .withTimeout(Duration.ofSeconds(*timeToWaitInSec*))
	 * .pollingEvery(Duration.ofMillis(*TimeToTryinMillisec*))
	 * .ignoring(WebDriverException.class);
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		WebDriver driver = null;
		driver = new ChromeDriver();
		driver.get("");
		driver.navigate().to("");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		WebElement element1 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.xpath("putxpath here of that element"));

				if (ele.isEnabled()) {
					System.out.println("Element found");

				}
				return ele;
			}
		});

		element1.click();

	}

}
