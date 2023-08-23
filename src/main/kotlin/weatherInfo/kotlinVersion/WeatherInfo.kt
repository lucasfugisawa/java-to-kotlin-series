package weatherInfo.kotlinVersion

import weatherInfo.kotlinVersion.WeatherInfo.Color.*

class WeatherInfo(degrees: Int) {
    var prompt: String? = null
        private set
    var color: Color? = null
        private set

    init {
        updateWeatherInfo(degrees)
    }

    fun updateWeatherInfo(degrees: Int) =
        when {
            degrees <= 18 -> "cold" to BLUE
            degrees <= 28 -> "mild" to ORANGE
            else -> "hot" to RED
        }.run {
            prompt = "The weather is $first now!"
            color = second
        }

    enum class Color {
        BLUE,
        ORANGE,
        RED
    }
}

