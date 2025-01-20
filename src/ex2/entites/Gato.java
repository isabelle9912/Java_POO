package ex2.entites;

public class Gato extends Animal {
    private String nome;

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
