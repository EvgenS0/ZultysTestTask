package djinni.step_definitions

import core.driver.Driver
import djinni.pages.OffersSearchPage

class OffersSearchPageStepDefs {
    private val offersSearchPage = OffersSearchPage(Driver.instance)
    private val offerPageStepDefs = OfferPageStepDefs()
    fun userSelectsRelevantVacanciesAndRespondToThem() {
        val hrefList = offersSearchPage.getHrefValues()
        for (href in hrefList) {
            Driver.instance.navigate().to(href)
            offerPageStepDefs.userChecksDataForCompliance()
        }
    }
}