package weatherInfo.javaVersion;

import static weatherInfo.javaVersion.WeatherInfo.Color.*;

public class WeatherInfo {
    private String prompt;
    private Color color;

    public WeatherInfo(int degrees) {
        updateWeatherInfo(degrees);
    }

    public void updateWeatherInfo(int degrees) {
        final String description;
        final Color color;
        if (degrees <= 18) {
            description = "cold";
            color = BLUE;
        } else if (degrees <= 28) {
            description = "mild";
            color = ORANGE;
        } else {
            description = "hot";
            color = RED;
        }
        this.prompt = "The weather is " + description + " now!";
        this.color = color;
    }

    public String getPrompt() {
        return prompt;
    }

    public Color getColor() {
        return color;
    }

    public enum Color {
        BLUE, ORANGE, RED
    }
}

