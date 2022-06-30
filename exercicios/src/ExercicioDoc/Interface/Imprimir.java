package ExercicioDoc.Interface;

import ExercicioDoc.Model.Documento;

public interface Imprimir {
    public static void imprimirDoc(Documento documento) {
        System.out.println(documento.toString());
    }
}
