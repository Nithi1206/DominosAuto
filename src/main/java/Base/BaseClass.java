package Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseClass {


    public static WebDriver driver;

    public static void initializeBrowser(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }else {
            throw new IllegalArgumentException("Browser is not found");
        }
    }
    public static void openApp(String link){
        driver.get(link);
    }
    public static void windowMaximize(){
        driver.manage().window().maximize();
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    public static void quiteBrowser(){
        driver.quit();
    }
}
