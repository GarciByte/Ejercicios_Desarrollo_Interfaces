import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void palabra_Al_Reves_cat() {

        // Arrange
        String palabra = "cat";
        String expectedResult = "tac";
        StringUtils stringUtils = new StringUtils();

        // Act
        String actualResult = stringUtils.reverse(palabra);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void palabra_Al_Reves_dog() {

        // Arrange
        String palabra = "dog";
        String expectedResult = "god";
        StringUtils stringUtils = new StringUtils();

        // Act
        String actualResult = stringUtils.reverse(palabra);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void palabra_Al_Reves_apple() {

        // Arrange
        String palabra = "apple";
        String expectedResult = "elppa";
        StringUtils stringUtils = new StringUtils();

        // Act
        String actualResult = stringUtils.reverse(palabra);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void palabra_Al_Reves_david() {

        // Arrange
        String palabra = "david";
        String expectedResult = "divad";
        StringUtils stringUtils = new StringUtils();

        // Act
        String actualResult = stringUtils.reverse(palabra);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void palabra_Al_Reves_vacio() {

        // Arrange
        String palabra = "";
        String expectedResult = "";
        StringUtils stringUtils = new StringUtils();

        // Act
        String actualResult = stringUtils.reverse(palabra);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

     
    @Test
    public void palabra_Al_Reves_null() {

        // Arrange
        String palabra = null;
        StringUtils stringUtils = new StringUtils();

        // Act y Assert
        assertThrows(IllegalArgumentException.class, () -> stringUtils.reverse(palabra));
    }
}
