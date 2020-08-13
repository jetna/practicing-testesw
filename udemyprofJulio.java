package testes;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class udemyprofJulio {
    private WebDriver navegador;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\drivers\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.get("http://www.juliodelima.com.br/taskit/");
    }

    @Test
    public void testAdicionarUmaInformacoesAdicionarDoUsuario(){
        navegador.findElement(By.linkText("Sign in")).click();

        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        navegador.findElement(By.linkText("SIGN IN")).click();

        /*WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoME = me.getText();
        Assert.assertEquals("Hi, Julio", textoNoElementoME);*/
    }

}
