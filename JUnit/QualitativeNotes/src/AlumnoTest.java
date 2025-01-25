import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlumnoTest {

    @Test
    public void testGradeZero() {

        // Arrange
        double grade = 0;
        String expectedResult = "Muy deficiente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_2_999() {

        // Arrange
        double grade = 2.999;
        String expectedResult = "Muy deficiente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_3() {

        // Arrange
        double grade = 3.0;
        String expectedResult = "Insuficiente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_4_999() {

        // Arrange
        double grade = 4.999;
        String expectedResult = "Insuficiente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_5() {

        // Arrange
        double grade = 5;
        String expectedResult = "Suficiente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_6_999() {

        // Arrange
        double grade = 6.999;
        String expectedResult = "Bien";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_7() {

        // Arrange
        double grade = 7.0;
        String expectedResult = "Notable";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_8_999() {

        // Arrange
        double grade = 8.999;
        String expectedResult = "Notable";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testGrade_10() {

        // Arrange
        double grade = 10;
        String expectedResult = "Sobresaliente";
        Alumno alumno = new Alumno();
        alumno.setGrade(grade);

        // Act
        String actualResult = alumno.getQualitativeGrade();

        // Assert
        assertEquals(expectedResult, actualResult);
    }

}
