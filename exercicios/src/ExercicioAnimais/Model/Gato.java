package ExercicioAnimais.Model;

import ExercicioAnimais.Interfaces.Carnivoros;

public class Gato extends Animal implements Carnivoros {

    @Override
    public void setNomeAnimal(String nomeAnimal) {
        System.out.println("Meu nome é " + nomeAnimal + " e eu sou um(a) gato(a).");
    }

    @Override
    public void comerCarne(String comida) {
        System.out.println("Eu gosto de comer " + comida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
