package projeto.automacao.validandotitlesite;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testjunit {
	WebDriver driver;

	@Before // Ele é executado antes de qualquer teste
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.ie.driver", "./Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();    
	}
	
	@After // Ele pe executado após qualquer teste
	public void tearDown() throws Exception {
		driver.quit()
	}
	

	
	
	// Testes abrir sites e validar Title
	@Test
	public void amazon() {
		driver.get("https://www.amazon.com.br");
		String titulo = driver.getTitle();
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);
	
	
	}

	@Test
	public void edge() {
		driver.get("https://www.microsoft.com/pt-br/edge");
		String titulo = driver.getTitle();
		assertEquals("Microsoft Edge", titulo);
	}

	@Test
	public void bradesco() {
		driver.get("https://www.bradesco.com.br");
		String titulo = driver.getTitle();
		assertEquals("Banco Bradesco | Entre Nós, Você Vem Primeiro", titulo);
	}

}
