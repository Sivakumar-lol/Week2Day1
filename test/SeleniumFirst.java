package selenium.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {

	public static void main(String[] args) throws InterruptedException{
		ChromeDriver driver=new ChromeDriver();      
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
