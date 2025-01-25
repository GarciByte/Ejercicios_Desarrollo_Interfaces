package modelo;

import java.util.ArrayList;
import java.util.Comparator;

public class Seleccion {
    private ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
    private ArrayList<Candidato> seleccionadosHabilidad = new ArrayList<Candidato>();
    private ArrayList<Candidato> seleccionadosTodo = new ArrayList<Candidato>();

    private int numCandidatos = 18300;
    private int numSleccionados = 11;

    public int Seleccionar(int numCandidatos, int numSeleccionados, float porcentajeSuerte) {
        this.numCandidatos = numCandidatos;
        this.numSleccionados = numSeleccionados;
        crearCandidatos(porcentajeSuerte);
        seleccionarCandidatosPorHabilidad();
        seleccionarCandidatosTodo();
        return comparar();
    }

    private void crearCandidatos(float porcentajeSuerte) {
        for (int i = 0; i < numCandidatos; i++) {
            Candidato candidato = new Candidato(i, porcentajeSuerte);
            candidatos.add(candidato);
        }
    }

    private void seleccionarCandidatosPorHabilidad() {
        candidatos.sort(new Comparator<Candidato>() {
            @Override
            public int compare(Candidato o1, Candidato o2) {
                return Float.compare(o1.getHabilidad(), o2.getHabilidad());
            }
        });
        for (int i = 0; i < numSleccionados; i++) {
            seleccionadosHabilidad.add(candidatos.get(i));
        }
    }

    private void seleccionarCandidatosTodo() {
        candidatos.sort(new Comparator<Candidato>() {
            @Override
            public int compare(Candidato o1, Candidato o2) {
                return Float.compare(o1.getHabilidadySuerte(), o2.getHabilidadySuerte());
            }
        });
        for (int i = 0; i < numSleccionados; i++) {
            seleccionadosTodo.add(candidatos.get(i));
        }
    }

    public int comparar() {
        int coincidencias = 0;
        for (int i = 0; i < numSleccionados; i++) {
            if (seleccionadosHabilidad.contains(seleccionadosTodo.get(i)))
                coincidencias++;
        }
        return coincidencias;
    }
}
