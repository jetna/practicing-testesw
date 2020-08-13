package testes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvocacoesEnaveConhecimentoTest {
    private WebDriver navegador;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
    }
    @Test
    public void navegadorFABeNaveConhecimento() {
        //Assert.assertEquals(1, 5);
        //Assert.assertEquals(1, 5);
        //navegador.get("https://github.com/jetna");
        navegador.get("http://convocacaotemporarios.fab.mil.br");
        //navegador.findElement(By.linkText("Fechar")).click(); NÃO FUNCIONA
        //navegador.findElement(By.id("modalNoticias")); NÃO FUNCIONA
        //navegador.findElement(By.name("Fechar")).click(); NÃO FUNCIONA
        navegador.findElement(By.cssSelector(".btn-default")).click(); //script gerador através do selenium IDE FUNCIONA
        // Assert.assertEquals(1, 1);

        navegador.get("https://capacitacao.navedoconhecimento.org.br/");

        navegador.findElement(By.cssSelector(".search-box > input")).sendKeys("robótica");
    }
        @After
        public void tearDown(){
        navegador.quit();}
    }

