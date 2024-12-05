package entites;

public class ProfessorDE  extends entites.Professor {
    private double salario;

    public ProfessorDE(int matricula, String nome, int cargaHoraria, double salario) {
        super(matricula, nome, cargaHoraria); // Chama o construtor da superclasse
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo(); // Exibe informacões comuns da classe
        System.out.println("Salário (Dedicação Exclusiva): R$ " + salario);
    }
}
