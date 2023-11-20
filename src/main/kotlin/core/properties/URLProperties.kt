package core.properties

import java.util.*

class URLProperties {
    lateinit var zultysSiteURL: String

    fun loadFromProperties(properties: Properties) {
        zultysSiteURL = properties.getProperty("zultysSiteURL")
    }
}