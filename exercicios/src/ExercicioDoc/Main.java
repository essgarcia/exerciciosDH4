package ExercicioDoc;

import ExercicioDoc.Interface.Imprimir;
import ExercicioDoc.Model.Curriculo;
import ExercicioDoc.Model.LivroPDF;
import ExercicioDoc.Model.Pessoa;
import ExercicioDoc.Model.Relatorio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("******* Relatorio *******");
        Relatorio relatorio = new Relatorio("Relatorio", "Jessica", "Milena", "Teste de Relatório", 248);
        Imprimir.imprimirDoc(relatorio);

        System.out.println("\n******* Livro PDF *******");
        LivroPDF livro = new LivroPDF("Livro PDF", "Milena", "Teste de LivroPDF", 345, "Teste");
        Imprimir.imprimirDoc(livro);

        System.out.println("\n******* CV *******");
        List<String> habilidades =  new ArrayList<String>();
        Pessoa pessoa = new Pessoa("Jessica", 24, habilidades);
        habilidades.add("Colorir");
        habilidades.add("Jogar");

        Curriculo curriculo = new Curriculo("Curriculo", pessoa);
        Imprimir.imprimirDoc(curriculo);
    }
}
