package ExercicioBanco.Model;

import ExercicioBanco.Interfaces.ConsultaSaldo;
import ExercicioBanco.Interfaces.Deposito;
import ExercicioBanco.Interfaces.Saque;
import ExercicioBanco.Interfaces.Transferencia;

public class Basico implements Saque, Deposito, Transferencia, ConsultaSaldo {

    @Override
    public void sacar(double valor) {
        System.out.println("Realizando saque " + valor);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Realizando deposito " + valor);
    }

    @Override
    public void transferir(double valor) {
        System.out.println("Realizando transferencia " + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void transacaoOk(String tipoTransacao) {
        System.out.println("Transaçao " + tipoTransacao + " realizada.");
    }

    @Override
    public void transacaoNaoRealizada(String tipoTransacao) {
        System.out.println("Não foi possível realizar a transação, tente " + tipoTransacao + " novamente.");
    }
}
