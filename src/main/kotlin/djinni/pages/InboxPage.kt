package djinni.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class InboxPage(private val driver: WebDriver) : BasePage(driver) {

    @FindBy(xpath = "//*[@class=\"nav-link\"][contains(@href,'job')]")
    lateinit var jobsBnt: WebElement
}