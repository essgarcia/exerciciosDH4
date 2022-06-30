package ExercicioBanco.Model;

import ExercicioBanco.Interfaces.ConsultaSaldo;
import ExercicioBanco.Interfaces.PagamentoServicos;
import ExercicioBanco.Interfaces.Saque;
import ExercicioBanco.Interfaces.Transferencia;

public class Cobrador implements Saque, ConsultaSaldo, Transferencia, PagamentoServicos {

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando " + valor);
    }

    @Override
    public void transferir(double valor) {
        System.out.println("Transferindo " + valor);
    }

    @Override
    public void pagarServico(String tipoServico) {
        System.out.println("Pagando " + tipoServico);
    }

    @Override
    public void transacaoOk(String tipoTransacao) {
        System.out.println("Transacao " + tipoTransacao + " realizada.");
    }

    @Override
    public void transacaoNaoRealizada(String tipoTransacao) {
        System.out.println("Não foi possível realizar a transacao, tente " + tipoTransacao + " novamente.");
    }
}
