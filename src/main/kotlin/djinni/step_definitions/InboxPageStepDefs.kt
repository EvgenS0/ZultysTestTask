package djinni.step_definitions

import core.driver.Driver
import djinni.pages.InboxPage

class InboxPageStepDefs {
    private val inboxPage = InboxPage(Driver.instance)

    fun userClickJobsBtn(): OffersSearchPageStepDefs {
        inboxPage.jobsBnt.click()
        return OffersSearchPageStepDefs()
    }
}