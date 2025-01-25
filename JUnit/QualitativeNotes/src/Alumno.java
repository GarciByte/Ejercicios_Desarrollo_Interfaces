public class Alumno {

    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getQualitativeGrade() {

        if (grade >= 9.0 && grade <= 10.0) {
            return "Sobresaliente";

        } else if (grade >= 7.0) {
            return "Notable";

        } else if (grade >= 6.0) {
            return "Bien";

        } else if (grade >= 5.0) {
            return "Suficiente";

        } else if (grade >= 3.0) {
            return "Insuficiente";

        } else {
            return "Muy deficiente";
        }
    }
}