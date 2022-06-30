package ExercicioDoc.Model;

import java.util.List;

public class Curriculo extends Documento{

    private Pessoa pessoa;

    public Curriculo(String tipoDoc, Pessoa pessoa) {
        super(tipoDoc);
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Teste de Curriculo - " + '\n' +
                "Dados da Pessoa: " + pessoa;
    }
}
