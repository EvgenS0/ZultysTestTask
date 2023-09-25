package djinni.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class OfferPage(private val driver: WebDriver) : BasePage(driver) {
    @FindBy(xpath = "//*[@class='mb-4'][1]")
    lateinit var descriptionTest: WebElement

    @FindBy(xpath = "//*[@class='jobs-post--action-btns']//button")
    lateinit var applyBtn: WebElement

    @FindBy(xpath = "//*[@class='table table-hover']/*/*[1]")
    lateinit var templateBtn: WebElement

    @FindBy(id = "job_apply")
    lateinit var confirmBtn: WebElement
}