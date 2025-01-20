package ex1.app;

import ex1.entites.Carro;
import ex1.entites.Carros;

import java.util.ArrayList;
import java.util.Scanner;

public class Executor {

    public static final Scanner sc = new Scanner(System.in);

    //public Carros carros = new Carros();

    public static void main(String[] args) {
        System.out.println("Programa para gerenciar carros");
        while (true) {
            verificarAcao(menu());
        }
    }

    public static byte menu() {
        System.out.println("1. Inserir carro"
        + "\n2. Remover carro"
        + "\n3. Atualizar carro"
        + "\n4. Excluir carro"
        + "\n0. Sair"
        + "\n\nO que deseja fazer: ");
        return Byte.parseByte(sc.nextLine());
    }


    public static void verificarAcao(byte opcao) {
        switch (opcao) {
            case 0:
                System.exit(0);
            case 1:
                inserirCarro();
                break;
            case 2:

        }
    }

    public static void inserirCarro() {
        System.out.println("Digite a marca do carro: ");
        String marca = sc.nextLine();

        System.out.println("Digite o modelo do carro: ");
        String modelo = sc.nextLine();

        System.out.println("Digite o ano do carro: ");
        short ano = sc.nextShort();

        System.out.println("Digite a placa do carro: ");
        String placa = sc.nextLine();


        Carro carro = new Carro(marca, modelo, ano, placa );

        System.out.println("Carro inserido com sucesso!");
        System.out.println(carro);
    }

    public static void removerCarro() {
        System.out.println("Digite a placa do carro: ");
        String placa = sc.nextLine();

    }

    public static boolean carroExiste(Carro carro) {
        return false;
    }
}
