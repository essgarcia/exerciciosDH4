package ExercicioDoc.Model;

import ExercicioDoc.Model.Documento;

public class Relatorio extends Documento {

    private String nomeAutor;
    private String nomeRevisor;
    private String texto;
    private int numPag;

    public Relatorio(String tipoDoc, String nomeAutor, String nomeRevisor, String texto, int numPag) {
        super(tipoDoc);
        this.nomeAutor = nomeAutor;
        this.nomeRevisor = nomeRevisor;
        this.texto = texto;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Teste de Relatorio - " + '\n' +
                "Nome do Autor: " + nomeAutor + '\n' +
                "Nome do Revisor: " + nomeRevisor + '\n' +
                "Texto: " + texto + '\n' +
                "Numero de Paginas:" + numPag;
    }
}
