package professor.entites;

public class ProfessorHorista extends Professor{
    private double salarioHora;

    public ProfessorHorista(int matricula, String nome, int cargaHoraria, double salarioHora) {
        super(matricula, nome, cargaHoraria);
        this.salarioHora = salarioHora;
    }

    // Getters e Setters
    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    // Método para calcular o salário baseado na carca horária
    public double getSalario(){
        return this.salarioHora * getCargaHoraria();
    }

    // Sobrescrita do método exibirInfo
    @Override
    public void exibirInfo(){
        super.exibirInfo(); // Exibe informações comuns da superclasse
        System.out.println("Salário Hora: R$ " + salarioHora);
        System.out.println("Salário total "+ getSalario());
    }
}
