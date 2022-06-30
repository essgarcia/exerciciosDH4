package ExercicioAnimais.Model;

import ExercicioAnimais.Interfaces.Herbivoros;

public class Vaca extends Animal implements Herbivoros{


    @Override
    public void setNomeAnimal(String nomeAnimal) {
        System.out.println("Meu nome é " +nomeAnimal + " e eu sou uma vaca.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Muuu!");
    }

    @Override
    public void comerPasto(String comida) {
        System.out.println("A vaca come " + comida);
    }
}
