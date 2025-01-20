package ex1.entites;

public class Carro {
    public String marca;
    public String modelo;
    public short ano;
    public String placa;

    public Carro(String marca, String modelo, short ano, String placa) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setPlaca(placa);
    }

   private String getMarca() {
        return marca;
   }

   public void setMarca(String marca) {
        this.marca = marca;
   }

   private String getModelo() {
        return modelo;
   }

   public void setModelo(String modelo) {
        this.modelo = modelo;
   }

   private int getAno() {
        return ano;
   }

   public void setAno(short ano) {
        this.ano = ano;
   }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public void exibirDetalhes() {
       System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno());
   }
}
