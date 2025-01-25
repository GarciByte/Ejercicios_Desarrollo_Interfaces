import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void validEmail_StandardFormat() {

        // Arrange
        String email = "usuario.prueba@gmail.com";
        Boolean expectedResult = true;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validEmail_WithSubdomains() {

        // Arrange
        String email = "prueba@hotmail.company.co.es";
        Boolean expectedResult = true;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validEmail_WithPlusAndNumbers() {

        // Arrange
        String email = "contacto2025+support@newsletter.org";
        Boolean expectedResult = true;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_MissingDomain() {

        // Arrange
        String email = "soporte@company";
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_StartsSymbol() {

        // Arrange
        String email = "@gmail.com";
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_StartsWithHyphen() {

        // Arrange
        String email = "usuario@-gmail-dominio.com";
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_WithSpaces() {

        // Arrange
        String email = "ejemplo email@dominio.com";
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_EmptyString() {

        // Arrange
        String email = "";
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void invalidEmail_Null() {

        // Arrange
        String email = null;
        Boolean expectedResult = false;
        EmailValidator emailValidator = new EmailValidator();

        // Act
        Boolean actualResult = emailValidator.isValidEmail(email);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
