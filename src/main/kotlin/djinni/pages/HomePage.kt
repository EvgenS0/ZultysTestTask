package djinni.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class HomePage(private val driver: WebDriver) : BasePage(driver) {
    @FindBy(xpath = "//*[@data-analytics-param='login_homepage']")
    lateinit var loginInBtn: WebElement

}