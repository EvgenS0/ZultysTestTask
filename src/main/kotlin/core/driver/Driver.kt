package core.driver


import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object Driver {
    val instance: WebDriver by lazy {
        val driver = ChromeDriver()
        driver.manage().window().maximize()
        driver
    }
}


