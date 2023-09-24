package djinni.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class LoginPage(private val driver: WebDriver) : BasePage(driver) {
    @FindBy(id = "email")
    lateinit var emailInput: WebElement

    @FindBy(id = "password")
    lateinit var passwordInput: WebElement

    @FindBy(xpath = "//*[@type='submit']")
    lateinit var submitBtn: WebElement

}