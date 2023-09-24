package core.listeners

import core.driver.Driver
import org.openqa.selenium.WebDriver
import org.testng.ITestContext
import org.testng.ITestListener
import org.testng.ITestResult

class TestNGListener : ITestListener {
    override fun onTestStart(result: ITestResult?) {
    }

    override fun onTestSuccess(result: ITestResult?) {
        closeAllTabs(Driver.instance)
    }

    override fun onTestFailure(result: ITestResult?) {
        closeAllTabs(Driver.instance)
    }

    override fun onTestSkipped(result: ITestResult?) {
    }

    override fun onTestFailedButWithinSuccessPercentage(result: ITestResult?) {
    }

    override fun onStart(context: ITestContext?) {
    }

    override fun onFinish(context: ITestContext?) {
    }

    private fun closeAllTabs(driver: WebDriver) {
        val windowHandles = driver.windowHandles
        for (handle in windowHandles) {
            driver.switchTo().window(handle)
            driver.close()
        }
    }
}
