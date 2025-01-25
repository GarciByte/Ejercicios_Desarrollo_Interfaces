import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd_menos_10_mas_12() {

        // Arrange
        int num1 = -10;
        int num2 = 12;
        int expectedResult = 2;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdd_2_mas_2() {

        // Arrange
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdd_menos_5_mas_2() {

        // Arrange
        int num1 = -5;
        int num2 = 2;
        int expectedResult = -3;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAdd_3_mas_5() {

        // Arrange
        int num1 = 3;
        int num2 = 5;
        int expectedResult = 8;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.add(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract_5_menos_2() {

        // Arrange
        int num1 = 5;
        int num2 = 2;
        int expectedResult = 3;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.subtract(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract_menos_5_menos_2() {

        // Arrange
        int num1 = -5;
        int num2 = 2;
        int expectedResult = -7;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.subtract(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract_10_menos_30() {

        // Arrange
        int num1 = 10;
        int num2 = 30;
        int expectedResult = -20;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.subtract(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply_2_por_2() {

        // Arrange
        int num1 = 2;
        int num2 = 2;
        int expectedResult = 4;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.multiply(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testMultiply_5_por_4() {

        // Arrange
        int num1 = 5;
        int num2 = 4;
        int expectedResult = 20;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.multiply(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide_10_entre_2() {

        // Arrange
        int num1 = 10;
        int num2 = 2;
        int expectedResult = 5;
        Calculator calculator = new Calculator();

        // Act
        int actualResult = calculator.divide(num1, num2);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
