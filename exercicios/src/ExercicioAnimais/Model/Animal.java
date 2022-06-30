package ExercicioAnimais.Model;

public abstract class Animal {

    private String nomeAnimal;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void emitirSom(){}
}
