package ExercicioBanco.Model;

import ExercicioBanco.Interfaces.*;

public class Executivo implements ConsultaSaldo, Deposito, Saque, PagamentoServicos, Transferencia {

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Realizando deposito " + valor);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Realizando saque " + valor);
    }

    @Override
    public void transferir(double valor) {
        System.out.println("Realizando transferencia " + valor);
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
        System.out.println("Transacao " + tipoTransacao + " não realizada, tente novamente.");
    }
}
