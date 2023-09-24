package core

import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.PageFactory

open class BasePage(private val driver: WebDriver) {
    init {
        PageFactory.initElements(driver, this)
    }
}
