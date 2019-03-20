package CoreJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		
		System.out.println("Hi JAva");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Sg00486431\\TECHM\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		

	}

}
