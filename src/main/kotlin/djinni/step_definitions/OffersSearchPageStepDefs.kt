package djinni.step_definitions

import core.driver.Driver
import djinni.pages.OffersSearchPage

class OffersSearchPageStepDefs {
    private val offersSearchPage = OffersSearchPage(Driver.instance)
    private val offerPageStepDefs = OfferPageStepDefs()
    fun userSelectsRelevantVacanciesAndRespondToThem() {
        for (offer in offersSearchPage.jobLinks) {
            offer.click()
            offerPageStepDefs.userChecksDataForCompliance()
        }
    }
}