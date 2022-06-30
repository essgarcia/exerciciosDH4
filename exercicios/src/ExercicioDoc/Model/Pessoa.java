package ExercicioDoc.Model;

import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private List<String> habilidade;

    public Pessoa(String nome, int idade, List<String> habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return '\n' +
                "Nome da Pessoa: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Habilidade: " + habilidade + '\n';
    }
}
