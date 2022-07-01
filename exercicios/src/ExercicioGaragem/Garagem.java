package ExercicioGaragem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garagem {
    private int id;
    private List<Veiculo> veiculos = new ArrayList<>();

    public Garagem(int id, List<Veiculo> veiculos) {
        this.id = id;
        this.veiculos = veiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void compararMarca(){
        var listaOrganizada = veiculos.stream()
                .sorted((carro1, carro2) -> carro1.compareToMarca(carro2))
                .collect(Collectors.toList());
        listaOrganizada.forEach(val -> System.out.println(val.getMarca()));
    }

    public void comparaValOrdCresc(){
        var listaOrdCres= veiculos.stream()
                .sorted((carro1, carro2) -> carro1.compareTo(carro2))
                .collect(Collectors.toList());
        listaOrdCres.forEach(val -> System.out.println(val.getPreco()));
    }

    public void comparaValMenorMil(double valor){
        var listaBaratos= veiculos.stream()
                .filter(veiculo -> veiculo.getPreco()<valor)
                .collect(Collectors.toList());
        listaBaratos.forEach(val -> System.out.println(val.getPreco()));
    }

    public void comparaValMaiorMil(double valor){
        var listCaros = veiculos.stream()
                .filter(veiculo -> veiculo.getPreco() >= valor)
                .collect(Collectors.toList());
        listCaros.forEach(val -> System.out.println(val.getPreco()));
    }

    public void mediaValVeiculos(){
       var somaval = veiculos.stream()
               .mapToDouble(carro -> carro.getPreco()).average();

        System.out.println(somaval.getAsDouble());
    }
}
