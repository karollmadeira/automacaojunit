import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	WebDriver driver;

	@Before
	public void setUp() throws Exception{
		
	// codigo para indicar navegador
		System.setProperty("webdriver.chrome.driver", "./DRIVER/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.4devs.com.br/gerador_de_pessoas");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"bt_gerar_pessoa\"]")).click();  
		   Thread.sleep(3000);
		
		String nome = driver.findElement(By.id("nome")).getText();   
		String celular = driver.findElement(By.id("celular")).getText();
		String email = driver.findElement(By.id("email")).getText();
		String cpf = driver.findElement(By.id("cpf")).getText();
		String data = driver.findElement(By.id("data_nasc")).getText();
		     driver.quit();
		
	  driver = new ChromeDriver();
	  driver.get("https://www.bancointer.com.br/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	  driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)")).click();
	      Thread.sleep(2000);
	  
	  driver.findElement(By.id("nome")).sendKeys(nome);
	  driver.findElement(By.id("celular")).sendKeys(celular);
	  driver.findElement(By.id("email")).sendKeys(email);
	  driver.findElement(By.id("cpf")).sendKeys(cpf);
	  driver.findElement(By.id("dataNascimento")).sendKeys(data);
	      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[6]/div/label")).click();
      driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/form/div/div[7]/div[2]/button")).click();
		
		
		
		
		
		// comando para chamar o drive para o before
		/*
		driver = new ChromeDriver();
		// comando para indicar url
		driver.get("https://www.bancointer.com.br/");
		// comando para maximizar a tela
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
		driver.findElement(By.cssSelector(
				"#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)"))
				.click();
		    Thread.sleep(5000);
		driver.findElement(By.id("nome")).sendKeys("Teste flash code");
		driver.findElement(By.id("celular")).sendKeys("62991008090");
        driver.findElement(By.id("email")).sendKeys("flashcode@gmail.com");
        driver.findElement(By.id("cpf")).sendKeys("48014842049");
        driver.findElement(By.id("dataNascimento")).sendKeys("03051998");
        driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
        driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > div.d-none.d-md-block > button")).click();
	*/
	}

	private WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}

	@After
	public void tearDown() throws Exception {

		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		String texto = driver.findElement(By.cssSelector("body > div.style__ModalContent-wuavw4-0.hOXgJK > div.style__Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
        System.out.println(texto);
        assertEquals(texto, "Prontinho! Recebemos os seus dados.");
        
        
	}

}
