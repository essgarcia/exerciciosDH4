package ExercicioGaragem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Fiesta", "Ford", 1000));
        veiculos.add(new Veiculo("Focus", "Ford", 1200));
        veiculos.add(new Veiculo("Explorer", "Ford", 2500));
        veiculos.add(new Veiculo("Uno", "Fiat", 500));
        veiculos.add(new Veiculo("Cronos", "Fiat", 1000));
        veiculos.add(new Veiculo("Torino", "Fiat", 1250));
        veiculos.add(new Veiculo("Aveo", "Chevrolet", 1250));
        veiculos.add(new Veiculo("Spin", "Chevrolet", 2500));
        veiculos.add(new Veiculo("Corola", "Toyota", 1200));
        veiculos.add(new Veiculo("Fortuner", "Toyota", 3000));
        veiculos.add(new Veiculo("Logan", "Renault", 950));

        Garagem garagem = new Garagem(3684, veiculos);

        System.out.println("****** Valores Ordenados Crescentemente");
        garagem.comparaValOrdCresc();

        System.out.println("\n****** Marcas Ordenadas");
        garagem.compararMarca();

        System.out.println("\n****** Valores Menores que Mil");
        garagem.comparaValMenorMil(1000);

        System.out.println("\n****** Valores Maiore ou Iguais a Mil");
        garagem.comparaValMaiorMil(1000);


        System.out.println("\n****** Media de Valores");
        garagem.mediaValVeiculos();

    }
}
