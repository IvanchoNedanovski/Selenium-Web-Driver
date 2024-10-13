package Popups_Section29_Autoit.Popups_Section29_Autoit;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ivanc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		HashMap<String , Object> chromePrefs = new HashMap<String , Object>();
		chromePrefs.put("profile.default_content_sittings.popups", 0);
		chromePrefs.put("download.default_directory",downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
        Runtime.getRuntime().exec("C:\\Users\\ivanc\\Desktop\\fileupload.exe");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='btn']")));
        driver.findElement(By.cssSelector("button[class*='btn']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download JPG images")));
        driver.findElement(By.linkText("Download JPG images")).click();
        Thread.sleep(5000);
       // File f =new File("C:\\Users\\ivanc\\Downloads\\ilovepdf_pages-to-jpg.zip");
        File f =new File(downloadPath+"/ilovepdf_pages-to-jpg.zip");
        if (f.exists())
        {
        	Assert.assertTrue(f.exists());
        	if(f.delete())
        		System.out.println("File deleted");
        }
        
	}

	}


