package com.ensa;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// 4 : 
// ce code permet au service technique d'accepter une demande et d'inviter une comission et d'ajouter des coordonés à cette demande

public class Main {

	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://127.0.0.1:5173/login");
	        driver.manage().window().maximize();
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        Thread.sleep(2000);
	        WebElement inputEmail = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
	        inputEmail.sendKeys("service-technique@gmail.com");
	        Thread.sleep(500);
	        
	        WebElement inputPasswd = driver.findElement(By.xpath("//input[@id='passwdInput']"));
	        inputPasswd.sendKeys("123456789");
	        Thread.sleep(1000);
	        
	        WebElement ButtonLogin = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
	        ButtonLogin.click();
	        Thread.sleep(4000);
	    
	        String targetElement = "27S11T";
	        
	        
	        WebElement element = driver.findElement(By.xpath("//button[@id='details_" + targetElement + "']"));
	        element.click();
	        Thread.sleep(4000);
	        												  
	        WebElement ButtonAccepter = driver.findElement(By.cssSelector("#unique_"+targetElement+"_0"));
	        ButtonAccepter.click();
	        Thread.sleep(6000);
	       
	        WebElement element2 = driver.findElement(By.xpath("//button[@id='details_" + targetElement + "']"));
	        element2.click();
	        Thread.sleep(3000);
	        
	        WebElement buttonComission = driver.findElement(By.cssSelector("#unique_"+targetElement+"_2"));
	        buttonComission.click();
	        Thread.sleep(4000);
	        
	        
	        WebElement ButtonRep2 = driver.findElement(By.xpath("//button[@id='orange@gmail.com']"));
	        ButtonRep2.click();																	
	        Thread.sleep(2000);
	            
	        WebElement ButtonInviter = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/button[1]"));
	        ButtonInviter.click();															
	        Thread.sleep(3000);
	        
	        
	        WebElement ButtonObctifComis = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/p[1]"));
	        ButtonObctifComis.click();															
	        Thread.sleep(3000);
	        
	        
	        WebElement ButtonAutorisation = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/p[3]"));
	        ButtonAutorisation.click();															
	        Thread.sleep(2000);
	        
	        WebElement ButtonImporterFichier = driver.findElement(By.cssSelector("#file"));
	        String filePath = "C:\\Users\\ylach\\Desktop\\cours\\TP_Qazdar\\invitationCommission1.pdf";
	        ButtonImporterFichier.sendKeys(filePath);
	        Thread.sleep(2000);
	        
	        WebElement ButtonConfirmation = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[4]/button[1]"));
	        ButtonConfirmation.click();	
	        
	        Thread.sleep(3000);

	        WebElement element3 = driver.findElement(By.xpath("//button[@id='details_" + targetElement + "']"));
	        element3.click();
	        Thread.sleep(2000);
	       
	        WebElement ButtonVoirDecision = driver.findElement(By.cssSelector("#unique_"+targetElement+"_1"));
	        ButtonVoirDecision.click();	
	        Thread.sleep(3000);
	        
	        WebElement ButtonAjouterCoord = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[2]/p[2]/div[1]/div[1]/div[1]/button[1]"));
	        ButtonAjouterCoord.click();									
	        Thread.sleep(3000);
	        
	        WebElement ButtonAjouterCoord2 = driver.findElement(By.cssSelector("#id_"+targetElement));
	        ButtonAjouterCoord2.click();								
	        Thread.sleep(3000);
	        
	        WebElement ButtonAjouterCoord3 = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[1]"));
	        ButtonAjouterCoord3.click();							
	        Thread.sleep(2000);
	        
	        WebElement inputLongitude = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/input[1]"));
	        inputLongitude.sendKeys("-9.252");						
	        Thread.sleep(500);
	        WebElement inputLatitude = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/input[2]"));
	        inputLatitude.sendKeys("30.254");						
	        Thread.sleep(500);
	        
	        WebElement ButtonConfirmationFinal = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/button[1]"));
	        ButtonConfirmationFinal.click();
	        Thread.sleep(3000);
	        
	        WebElement ButtonAccord = driver.findElement(By.xpath("//button[contains(text(),\"D'accord\")]"));
	        ButtonAccord.click();
	        Thread.sleep(2000);
	        
	        driver.get("http://127.0.0.1:5173/homeSTechnique");
	        Thread.sleep(2000);
	         
	       
	        
	        WebElement LogOut = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/p[1]"));
	        LogOut.click();
	        Thread.sleep(2000);
	        driver.close();	      
	      

	}

}
