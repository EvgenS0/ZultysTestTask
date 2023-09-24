package core.properties

import java.io.IOException
import java.util.*

class PropertiesReader {
    private val urlProperties = URLProperties()

    init {
        val urlPropertiesFile = "urls.properties"

        urlProperties.loadFromProperties(loadProperty(urlPropertiesFile))
    }

    fun urlsProperties(): URLProperties {
        return urlProperties
    }

    private fun loadProperty(filename: String?): Properties {
        val properties = Properties()
        try {
            PropertiesReader::class.java.getResourceAsStream("/$filename").use { inputStream ->
                properties.load(inputStream)
            }
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
        return properties
    }
}

