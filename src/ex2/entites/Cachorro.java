package ex2.entites;

public class Cachorro extends Animal{
    private String nome;

    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Latido");
    }
}
