package common;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class CommonActions {
	

	public static void clickElement(WebElement element)throws NullPointerException,NoSuchElementException{
		element.click();
	}
	
	public static void pause(long sec)throws InterruptedException{
		Thread.sleep(sec*1000);
	}
	
	public static void inputText(WebElement element,String input)throws NullPointerException,NoSuchElementException{
		element.sendKeys(input);
		
	}

}
