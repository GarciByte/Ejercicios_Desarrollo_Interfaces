package modelo;

public class Simulacion {

    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        simular(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]),
                Integer.parseInt(args[3])
        );
    }

    public static void simular(int numSimulaciones, int numCandidatos, int numSeleccionados, int porcentajeSuerte) {
        float coincidencias = 0f;
        for (int i = 0; i < numSimulaciones; i++) {
            coincidencias += new Seleccion().Seleccionar(numCandidatos, numSeleccionados, porcentajeSuerte);
        }
        System.out.println(coincidencias / numSimulaciones);
    }
}
