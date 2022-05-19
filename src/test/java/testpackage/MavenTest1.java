package testpackage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class MavenTest1 {
    public String baseURL = "https://www.javatpoint.com/";
    String driverPath = "C://msedgedriver.exe";

    public WebDriver driver;

    @Test
    public void test(){
        System.setProperty("webdriver.edge.driver",driverPath);
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);

        String URL = driver.getCurrentUrl();
        System.out.println(URL);
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
        driver.quit();
    }

}
