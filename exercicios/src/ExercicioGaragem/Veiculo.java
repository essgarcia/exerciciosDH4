package ExercicioGaragem;

import java.util.ArrayList;
import java.util.List;

public class Veiculo implements Comparable<Veiculo>{

    private String modelo;
    private String marca;
    private double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public int compareTo(Veiculo v) {
        if(this.preco < v.getPreco()){
            return -1;
        } else if (this.preco == v.getPreco()){
            return 0;
        }else {
            return 1;
        }
    }

    public int compareToMarca(Veiculo v) {
        return this.getMarca().compareTo(v.getMarca());
    }





}
