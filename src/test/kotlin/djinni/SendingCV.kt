package djinni

import core.listeners.TestNGListener
import djinni.step_definitions.HomePageStepDefs
import org.testng.annotations.Listeners
import org.testng.annotations.Test


@Listeners(TestNGListener::class)
class SendingCV {
    @Test
    fun userSendCVsToAllMatchingVacancies() {
        HomePageStepDefs()
            .userNavigatesToHomePage()
            .userClickLoginInBtn()
            .userFillEmailField()
            .userFillPasswordField()
            .userClickSubmitBtn()
            .userClickJobsBtn()
            .userSelectsRelevantVacanciesAndRespondToThem()
    }
}