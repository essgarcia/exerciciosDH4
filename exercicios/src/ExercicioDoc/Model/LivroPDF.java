package ExercicioDoc.Model;

import ExercicioDoc.Model.Documento;

public class LivroPDF extends Documento {

    private String nomeAutor;
    private String titulo;
    private int numPag;
    private String genero;

    public LivroPDF(String tipoDoc, String nomeAutor, String titulo, int numPag, String genero) {
        super(tipoDoc);
        this.nomeAutor = nomeAutor;
        this.titulo = titulo;
        this.numPag = numPag;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Teste LivroPDF - " + '\n' +
                "Nome do Autor: " + nomeAutor + '\n' +
                "Titulo: " + titulo + '\n' +
                "Numero de Paginas: " + numPag + '\n' +
                "Genero: " + genero;
    }
}
