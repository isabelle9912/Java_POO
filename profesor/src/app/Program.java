package app;

import entites.ProfessorDE;
import entites.ProfessorHorista;

public class Program {
    public static void main(String[] args) {
        // Cria um Professor DE
        ProfessorDE professorDE = new ProfessorDE(101, "Ana Silva", 40, 8000.00);

        System.out.println(professorDE);
        professorDE.exibirInfo();

        System.out.println();

        // Cria um Professor Horista
        ProfessorHorista professorHorista  = new ProfessorHorista(102, "José Carlos", 20, 50.00);

        System.out.println(professorHorista);
        professorHorista.exibirInfo();

    }
}
