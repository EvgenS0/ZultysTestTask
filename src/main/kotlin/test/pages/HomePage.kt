package test.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class HomePage(private val driver: WebDriver) : BasePage(driver) {
    @FindBy(xpath = "//span[@class='download' and not(ancestor::a[contains(@href, 'zultys.com/download-zac/')])]")
    lateinit var downloadBtns: MutableList<WebElement>

    @FindBy(xpath = "//a[@href]//button | //ancestor::a[contains(@href, 'zultys.com/download-zac/')] | //a[@href='MXreport.html']")
    lateinit var linkBtns: MutableList<WebElement>


}