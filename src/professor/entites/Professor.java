package professor.entites;

/**
 * - private
 * + public
 * # protected
 * default
 **/

public class Professor {
 protected int matricula;
 protected String nome;
 protected int cargaHoraria;

    // Construtor
    public Professor(int matricula, String nome, int cargaHoraria) {
        this.matricula = matricula;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    // Getter's e Setter's
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    // Método para exibir informações gerais
    public void exibirInfo() {
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Carga Horária: " + this.cargaHoraria);
    }
}
