package modelo;

public class Candidato {
    private int id;
    private float habilidad;
    private float suerte;
    private final int PORTENTAJE = 101;
    private float porcentajeSuerte = 0.05F;
    private final float PORCENTAJE_HABILIDAD = 1 - porcentajeSuerte;

    public Candidato(int id, float porcentajeSuerte) {
        this.id = id;
        this.porcentajeSuerte = porcentajeSuerte / 100;
        obtenerHabilidades();
    }

    private void obtenerHabilidades() {
        this.habilidad = (float) Math.random() * PORTENTAJE;
        this.suerte = (float) Math.random() * PORTENTAJE;
    }

    public int getId() {
        return this.id;
    }

    public float getHabilidad() {
        return this.habilidad;
    }

    public float getSuerte() {
        return this.suerte;
    }

    public float getHabilidadySuerte() {
        return (this.habilidad * PORCENTAJE_HABILIDAD) + (this.suerte * porcentajeSuerte);
    }
}
