import org.junit.Assert;
import org.junit.Test;

public class TemperatureConverterTest {

    // Celsius

    @Test
    public void testCelsiusToFahrenheitWith30() {

        // Arrange
        double celsius = 30;
        double expectedResult = 86;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testCelsiusToFahrenheitWith50() {

        // Arrange
        double celsius = 50;
        double expectedResult = 122;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testCelsiusToFahrenheitWith0() {

        // Arrange
        double celsius = 0;
        double expectedResult = 32;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testCelsiusToFahrenheitWithMinus10() {

        // Arrange
        double celsius = -10;
        double expectedResult = 14;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.celsiusToFahrenheit(celsius);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    // Fahrenheit

    @Test
    public void testFahrenheitToCelsiusWith5() {

        // Arrange
        double fahrenheit = 5;
        double expectedResult = -15;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testFahrenheitToCelsiusWith50() {

        // Arrange
        double fahrenheit = 50;
        double expectedResult = 10;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testFahrenheitToCelsiusWith32() {

        // Arrange
        double fahrenheit = 32;
        double expectedResult = 0;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testFahrenheitToCelsiusWithMinus13() {

        // Arrange
        double fahrenheit = -13;
        double expectedResult = -25;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.0000000001);
    }

    @Test
    public void testFahrenheitToCelsiusWith0() {

        // Arrange
        double fahrenheit = 0;
        double expectedResult = -17.7778;
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        // Act
        double actualResult = temperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Assert
        Assert.assertEquals(expectedResult, actualResult, 0.001);
    }
}
