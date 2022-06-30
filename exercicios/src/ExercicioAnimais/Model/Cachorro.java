package ExercicioAnimais.Model;

import ExercicioAnimais.Interfaces.Carnivoros;
import ExercicioAnimais.Model.Animal;

public class Cachorro extends Animal implements Carnivoros {
    @Override
    public void setNomeAnimal(String nomeAnimal) {
        System.out.println("Meu nome é " + nomeAnimal + " e eu sou um cachorro!");
    }

    @Override
    public void comerCarne(String comida) {
        System.out.println("Eu amo comer " + comida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }
}
