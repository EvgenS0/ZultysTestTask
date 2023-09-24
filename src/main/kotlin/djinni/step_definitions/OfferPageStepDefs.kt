package djinni.step_definitions

import core.driver.Driver
import core.properties.TXTReader
import djinni.pages.OfferPage

class OfferPageStepDefs {
    private val offerPage = OfferPage(Driver.instance)
    fun userChecksDataForCompliance() {
        val keywords = TXTReader().getListFromFile("keywords.txt")
        val text = offerPage.descriptionTest.text
        if (containsKeyword(text, keywords)) {
            offerPage.applyBtn.click()
        }
    }

    private fun containsKeyword(text: String, keywords: List<String>): Boolean {
        for (keyword in keywords) {
            if (text.contains(keyword, ignoreCase = true)) {
                return true
            }
        }
        return false
    }
}