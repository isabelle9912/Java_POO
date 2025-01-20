package ex2.app;

import ex2.entites.Animal;
import ex2.entites.Cachorro;
import ex2.entites.Gato;

import java.util.ArrayList;

public class Executor {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList();
        animals.add(new Cachorro("Luke"));
        animals.add(new Gato("Maze"));

        emitirSomAnimais(animals);
    }

    public static void emitirSomAnimais(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            animal.emitirSom();
        }
    }
}
