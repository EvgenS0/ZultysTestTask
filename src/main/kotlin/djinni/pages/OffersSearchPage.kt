package djinni.pages

import core.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

class OffersSearchPage(private val driver: WebDriver) : BasePage(driver) {
    @FindBy(xpath = "//*[@class='list-unstyled list-jobs mb-4']/*[not(.//*[@class='text-success'])]//*[@class='h3 job-list-item__link']")
    lateinit var jobLinks: MutableList<WebElement>

    fun getHrefValues(): List<String> {
        val hrefValues = mutableListOf<String>()
        for (offer in jobLinks) {
            hrefValues.add(offer.getAttribute("href"))
        }
        return hrefValues
    }
}