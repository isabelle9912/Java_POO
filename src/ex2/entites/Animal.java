package ex2.entites;

public abstract class Animal {
    private String nome;

    public Animal(String nome){
        setNome(nome);
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void emitirSom(){}

}
