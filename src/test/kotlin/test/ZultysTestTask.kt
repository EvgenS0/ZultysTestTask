package test

import core.listeners.TestNGListener
import test.step_definitions.HomePageStepDefs
import org.testng.annotations.Listeners
import org.testng.annotations.Test


@Listeners(TestNGListener::class)
class ZultysTestTask {
    @Test
    fun testTask() {
        HomePageStepDefs()
            .userNavigatesToHomePage()
            .userClicksOnDownloadBtns()
            .printAllLinksInConsole()
    }
}