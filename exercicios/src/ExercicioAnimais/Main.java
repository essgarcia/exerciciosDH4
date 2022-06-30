package ExercicioAnimais;

import ExercicioAnimais.Model.Cachorro;
import ExercicioAnimais.Model.Gato;
import ExercicioAnimais.Model.Vaca;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Vaca vaca = new Vaca();
        Gato gato = new Gato();

        System.out.println("*****Cachorro*****");
        cachorro.setNomeAnimal("Alfredão");
        cachorro.comerCarne("carne e ração.");
        cachorro.emitirSom();

        System.out.println("\n*****Vaca*****");
        vaca.setNomeAnimal("Mimosa");
        vaca.emitirSom();
        vaca.comerPasto("capim");

        System.out.println("\n*****Gato(a)*****");
        gato.setNomeAnimal("Lua");
        gato.comerCarne("peixe e ração.");
        gato.emitirSom();


    }
}
